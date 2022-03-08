package compiler.syntax.nonTerminal;

public class SelectorValorOReferencia extends NonTerminal {

    private String identificador;
    private boolean pasoReferencia;
    private Expresion expresion;

    public SelectorValorOReferencia(Expresion expresion) {

        super();
        this.expresion = expresion;
        this.pasoReferencia = false;
    }
 
    public SelectorValorOReferencia(String identificador) {

        super();
        this.identificador = identificador;
        this.pasoReferencia = true;
    }
}
