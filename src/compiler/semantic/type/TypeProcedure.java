package compiler.semantic.type;

import java.util.ArrayList;
import compiler.semantic.symbol.SymbolVariable;
import compiler.syntax.nonTerminal.SelectorValorOReferencia;
import es.uned.lsi.compiler.semantic.Scope;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeProcedure.
 */

public class TypeProcedure
    extends TypeBase
{   
    private ArrayList<SymbolVariable> parametros;

    public TypeProcedure(ScopeIF scope, String name, ArrayList<SymbolVariable> parametros) {
        super(scope, name);
        this.parametros = parametros;
    }

   /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope.
     */
    public TypeProcedure (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope
     * @param name The name of the procedure.
     */
    public TypeProcedure (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        return 1;
    }
}
