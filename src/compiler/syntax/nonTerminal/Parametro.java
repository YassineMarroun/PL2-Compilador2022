package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class Parametro extends NonTerminal{
    
    private SymbolIF simbolo;
    private TemporalIF temporal;
    private boolean esExpresion = false;
    private boolean esPasoReferencia = true;

    public Parametro() {
        
    }
}
