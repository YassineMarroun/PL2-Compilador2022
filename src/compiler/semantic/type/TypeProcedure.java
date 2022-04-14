package compiler.semantic.type;

import java.util.ArrayList;
import compiler.semantic.symbol.SymbolVariable;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeProcedure.
 */

public class TypeProcedure
    extends TypeBase
{   
    private ArrayList<SymbolVariable> parametros;

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

    public TypeProcedure(ScopeIF scope, String name, ArrayList<SymbolVariable> parametros) {
        super(scope, name);
        this.parametros = parametros;
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

    public ArrayList<SymbolVariable> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<SymbolVariable> parametros) {
        this.parametros = parametros;
    }
}
