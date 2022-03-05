package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */
public class TypeArray
    extends TypeBase
{   
   
    private int rango1;
    private int rango2;
    private TypeIF tipo;

	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeArray (ScopeIF scope, String name)
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
        return rango2 - rango1 + 1;
    }
}
