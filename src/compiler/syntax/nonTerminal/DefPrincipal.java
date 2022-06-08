package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.LabelIF;

public class DefPrincipal extends NonTerminal {
    
    private LabelIF labelPrincipal;

    public DefPrincipal(LabelIF labelPrincipal) {
        super();
        this.labelPrincipal = labelPrincipal;
    }
}
