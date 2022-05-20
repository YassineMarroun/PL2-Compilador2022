package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import compiler.CompilerContext;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;

public class ParametroFuncionOProc extends NonTerminal {

    private ArrayList<SelectorValorOReferencia> variables;
    private ArrayList<Parametro> parametros;

    public ParametroFuncionOProc(ArrayList<SelectorValorOReferencia> variables) {
        super();
        this.variables = variables;
        this.parametros = new ArrayList<Parametro>();
        setParametros();
    }
    
    private void setParametros() {

        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();

        for(SelectorValorOReferencia s : variables) {
            Parametro param = null;
            String nombreID = s.getIdentificador();
            if(s.isPasoReferencia()) {
                param = new Parametro(scopeManager.searchSymbol(nombreID), true);
            } else {
                Expresion exp = s.getExpresion();
                if(exp.isEsIdentificador()) {
                    String nombreIDExp = exp.getIdentificador();
                    param = new Parametro(scopeManager.searchSymbol(nombreIDExp), false);
                } else {
                    param = new Parametro(exp.getTemporal());
                }
            }
            parametros.add(param);
        }
    }

    public ArrayList<SelectorValorOReferencia> getVariables() {
        return variables;
    }

    public ArrayList<Parametro> getParametros() {
        return parametros;
    }
}