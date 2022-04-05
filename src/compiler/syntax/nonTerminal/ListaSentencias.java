package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaSentencias extends NonTerminal {

    private ArrayList<Sentencia> sentencias;

    public ListaSentencias() {
        super();
        this.sentencias = new ArrayList<Sentencia>();
    }

    public ArrayList<Sentencia> getSentencias() {
        return sentencias;
    }

    public void setSentencias(ArrayList<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }

    public void addSentencia(Sentencia sentencia) {
        this.sentencias.add(sentencia);
        System.out.println("Numero de sentencias: " + sentencias.size());
    }
}
