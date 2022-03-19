package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class RellenoIf extends NonTerminal {
    
    private ArrayList<Sentencia> sentencias;

    public RellenoIf(ArrayList<Sentencia> sentencias) {
        super();
        this.sentencias = sentencias;
    }

    public RellenoIf() {
        super();
        this.sentencias = new ArrayList<Sentencia>();
    }

    public ArrayList<Sentencia> getSentencias() {
        return sentencias;
    }

    public void setSentencias(ArrayList<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }
}
