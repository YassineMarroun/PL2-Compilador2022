package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import compiler.semantic.symbol.SymbolConstantEntero;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class ValorRango extends NonTerminal {

    private int numero;
    private boolean esValorEntero;
    private SymbolIF simbolo;
    private boolean esSimbolo;
    private MiembroVector miembroVector;
    
    public ValorRango(int numero) {
        super();
        this.numero = numero;
        this.esValorEntero = true;
        this.esSimbolo = false;
    }

    public ValorRango(SymbolIF simbolo) {
        super();
        this.simbolo = simbolo;
        this.esValorEntero = false;
        this.esSimbolo = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEsValorEntero() {
        return esValorEntero;
    }

    public void setEsValorEntero(boolean esValorEntero) {
        this.esValorEntero = esValorEntero;
    }

    public SymbolIF getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(SymbolIF simbolo) {
        this.simbolo = simbolo;
    }

    public int getRangoVector() {
        if(esValorEntero) {
            return numero;
        } else {
            int valor = 0;
            if(simbolo instanceof SymbolConstantEntero) {
                valor = ((SymbolConstantEntero)simbolo).getValorEntero();
            } else {
                SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();
                semanticErrorManager.semanticFatalError("Error semántico: el rango del vector no es una constante entera");
            }
            return valor;
        }  
    }
}
