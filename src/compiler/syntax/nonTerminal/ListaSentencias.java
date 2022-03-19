package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaSentencias extends NonTerminal {

    private ArrayList<Sentencia> sentencias;

    public ListaSentencias() {
        super();
        this.sentencias = new ArrayList<Sentencia>();
    }
}
