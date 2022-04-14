package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
    
    private String identificador;
    private boolean esIdentificador = false;
    private TypeIF tipo;

    public Expresion(String identificador) {
        super();
        this.identificador = identificador;
        this.esIdentificador = true;
    }

    public Expresion(TypeIF tipo) {
        super();
        this.tipo = tipo;
        this.esIdentificador = false;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isEsIdentificador() {
        return esIdentificador;
    }

    public void setEsIdentificador(boolean esIdentificador) {
        this.esIdentificador = esIdentificador;
    }

    public TypeIF getTipo() {
        return tipo;
    }

    public void setTipo(TypeIF tipo) {
        this.tipo = tipo;
    }

    public TypeIF getTipoExpresion() {
        
        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        if(esIdentificador) {
            // Se busca el identificador en la Tabla de Símbolos
            ScopeIF ambito = scopeManager.getCurrentScope();
            SymbolTableIF simbolosTabla = ambito.getSymbolTable();
            if(!simbolosTabla.containsSymbol(identificador)) {
                semanticErrorManager.semanticFatalError("Error semantico: identificador " + identificador + " no esta declarado");
            }
            SymbolIF simbolo = simbolosTabla.getSymbol(identificador);
            return simbolo.getType();
        } else {
            return tipo;
        }
    }
}
