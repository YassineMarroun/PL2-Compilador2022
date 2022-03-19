package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class RellenoIf extends NonTerminal {
    
    private ArrayList<Sentencia> sentencias;

    public RellenoIf(ArrayList<Sentencia> sentencias) {
        super();
        this.sentencias = sentencias;
    }
}
