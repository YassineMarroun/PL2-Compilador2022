package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import compiler.semantic.symbol.SymbolVariable;

public class DefVariables extends NonTerminal {

    private ArrayList<SymbolVariable> variables;

    public DefVariables(ArrayList<SymbolVariable> variables) {
        super();
        this.variables = variables;
    }
    
    public ArrayList<SymbolVariable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<SymbolVariable> variables) {
        this.variables = variables;
    }
}
