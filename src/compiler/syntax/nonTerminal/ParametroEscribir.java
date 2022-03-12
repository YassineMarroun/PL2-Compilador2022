package compiler.syntax.nonTerminal;

public class ParametroEscribir extends NonTerminal {

    private String cadena;
    private boolean esCadena;
    private Expresion expresion;
    private boolean esExpresion;

    public ParametroEscribir(String cadena) {
        super();
        this.cadena = cadena;
        this.esCadena = true;
        this.esExpresion = false;
    }

    public ParametroEscribir(Expresion expresion) {
        super();
        this.expresion = expresion;
        this.esCadena = false;
        this.esExpresion = true;
    }

    public ParametroEscribir() {
        this.esCadena = false;
        this.esExpresion = false;
    }
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public boolean isEsCadena() {
        return esCadena;
    }

    public void setEsCadena(boolean esCadena) {
        this.esCadena = esCadena;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    public boolean isEsExpresion() {
        return esExpresion;
    }

    public void setEsExpresion(boolean esExpresion) {
        this.esExpresion = esExpresion;
    }
}
