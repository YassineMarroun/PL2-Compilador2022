package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaVariables extends NonTerminal {

    private ArrayList<SelectorValorOReferencia> variables;
        
    public ListaVariables() {
        variables = new ArrayList<SelectorValorOReferencia>(); 
    }

    public void addSelector(SelectorValorOReferencia selector) {
        variables.add(selector);
    }

    public ArrayList<SelectorValorOReferencia> getVariables() {
        return variables;
    }
}
