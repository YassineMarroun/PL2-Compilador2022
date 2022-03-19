package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SentenciaFor extends Sentencia {

    private ArrayList<Sentencia> sentencias;

    public SentenciaFor(ArrayList<Sentencia> sentencias) {
        super();
        this.sentencias = sentencias;
    }

    public SentenciaFor() {
        super();
        this.sentencias = sentencias;
    }

    public ArrayList<Sentencia> getSentencias() {
        return sentencias;
    }

    public void setSentencias(ArrayList<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }
}
