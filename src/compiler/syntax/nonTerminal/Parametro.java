package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class Parametro extends NonTerminal {
    
    private SymbolIF simbolo;
    private TemporalIF temporal;
    private Expresion expresion;
    private boolean esExpresion = false;
    private boolean esPasoReferencia = true;

    public Parametro(SymbolIF simbolo, boolean esPasoReferencia) {
        super();
        this.simbolo = simbolo;
        this.esExpresion = false;
        this.esPasoReferencia = esPasoReferencia;
    }

    public Parametro(Expresion expresion, TemporalIF temporal) {
        super();
        this.expresion = expresion;
        this.temporal = temporal;
        this.esExpresion = true;
        this.esPasoReferencia = false;
    }

    public SymbolIF getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(SymbolIF simbolo){
        this.simbolo = simbolo;
    }

    public TemporalIF getTemporal() {
        return temporal;
    }

    public void setTemporal(TemporalIF temporal) {
        this.temporal = temporal;
    }

    public boolean isEsExpresion() {
        return esExpresion;
    }

    public void setEsExpresion(boolean esExpresion) {
        this.esExpresion = esExpresion;
    }

    public boolean isEsPasoReferencia() {
        return esPasoReferencia;
    }

    public void setEsPasoReferencia(boolean esPasoReferencia) {
        this.esPasoReferencia = esPasoReferencia;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }
}
