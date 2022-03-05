package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolConstantEntero;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class ValorRango extends NonTerminal {

    private int numero;
    private boolean esValorEntero;
    private SymbolIF simbolo;
    
    public ValorRango(int numero, boolean esValorEntero) {
        super();
        this.numero = numero;
        this.esValorEntero = esValorEntero;
    }

    public ValorRango(SymbolIF simbolo) {
        super();
        this.simbolo = simbolo;
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
        if(esValorEntero){
            return numero;
        } else {
            if(simbolo instanceof SymbolConstantEntero) {
                    ((SymbolConstantEntero)simbolo).getValorEntero();
            } else {
                SemanticErrorManager.semanticFatalError("Error semántico: ");
            }
        }
        return valor;
    }
}
