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
    private TypeIF type;
	private int inicio;
	private int fin;
    
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

    // Constructor TypeArray pasándole ScopIF, String, int, int y TypeIF
    public TypeArray (ScopeIF scope, String name, int inicio, int fin, TypeIF type)
    {
        super (scope, name);
        this.inicio = inicio;
        this.fin = fin;
        this.type = type;
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        return this.fin - this.inicio + 1;
    }

    // Devuelve type
	public TypeIF getType() {
		return type;
	}

	// Modifica type
	public void setType(TypeIF type) {
		this.type = type;
	}

	// Devuelve inicio
	public int getInicio() {
		return inicio;
	}

	// Modifica inicio
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	// Devuelve fin
	public int getFin() {
		return fin;
	}

	// Modifica fin
	public void setFin(int fin) {
		this.fin = fin;
	}
}
