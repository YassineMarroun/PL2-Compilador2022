package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import compiler.semantic.type.TypeArray;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;

public class MiembroVector extends NonTerminal {
    
    private String identificador;
    private ValorRango valorRango;

    public MiembroVector(String identificador, ValorRango valorRango) {
        super();
        this.identificador = identificador;
        this.valorRango = valorRango;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ValorRango getValorRango() {
        return valorRango;
    }

    public void setValorRango(ValorRango valorRango) {
        this.valorRango = valorRango;
    }

    public void comprobarMiembroVector() {

        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        // Se busca el identificador en la Tabla de Símbolos
        ScopeIF ambito = scopeManager.getCurrentScope();
        SymbolTableIF simbolosTabla = ambito.getSymbolTable();

        if(!simbolosTabla.containsSymbol(identificador)) {
            semanticErrorManager.semanticFatalError("Error semántico: identificador " + identificador + " no está declarado");
        }

        SymbolIF simbolo = simbolosTabla.getSymbol(identificador);
        if(!(simbolo.getType() instanceof TypeArray)) {
            semanticErrorManager.semanticFatalError("Error semántico: el tipo " + simbolo.getType().getName() + " no es de tipo vector");
        }

        // Recuperar el tipo base del array

        // ValorRango tiene que ser del mismo tipo que el vector
    }
}
