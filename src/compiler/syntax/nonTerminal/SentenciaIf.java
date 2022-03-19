package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SentenciaIf extends Sentencia {

    private ArrayList<Sentencia> sentenciasIF;
    private ArrayList<Sentencia> sentenciasElse;

    public SentenciaIf(ArrayList<Sentencia> sentenciasIF, ArrayList<Sentencia> sentenciasElse) {
        super();
        this.sentenciasIF = sentenciasIF;
        this.sentenciasElse = sentenciasElse;
    }

    public ArrayList<Sentencia> getSentenciasIF() {
        return sentenciasIF;
    }

    public void setSentenciasIF(ArrayList<Sentencia> sentenciasIF) {
        this.sentenciasIF = sentenciasIF;
    }

    public ArrayList<Sentencia> getSentenciasElse() {
        return sentenciasElse;
    }

    public void setSentenciasElse(ArrayList<Sentencia> sentenciasElse) {
        this.sentenciasElse = sentenciasElse;
    }
}
