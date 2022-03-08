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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isPasoReferencia() {
        return pasoReferencia;
    }

    public void setPasoReferencia(boolean pasoReferencia) {
        this.pasoReferencia = pasoReferencia;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }
}
