package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

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
    

    public TypeArray(ScopeIF scope, String name, int rango1, int rango2, TypeIF tipo) {
         
        super(scope, name);
        this.rango1 = rango1;
        this.rango2 = rango2;
        this.tipo = tipo;
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

    public int getRango1() {
        return rango1;
    }

    public void setRango1(int rango1) {
        this.rango1 = rango1;
    }

    public int getRango2() {
        return rango2;
    }

    public void setRango2(int rango2) {
        this.rango2 = rango2;
    }

    public TypeIF getTipo() {
        return tipo;
    }

    public void setTipo(TypeIF tipo) {
        this.tipo = tipo;
    }
}
