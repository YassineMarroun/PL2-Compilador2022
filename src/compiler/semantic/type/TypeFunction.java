package compiler.semantic.type;

import java.util.ArrayList;
import compiler.semantic.symbol.SymbolVariable;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeFunction.
 */

public class TypeFunction
    extends TypeProcedure
{   
    private TypeIF tipoRetorno;

    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope.
     */
    public TypeFunction (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope
     * @param name The name of the function.
     */
    public TypeFunction (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    public TypeFunction(ScopeIF scope, String name, ArrayList<SymbolVariable> parametros, TypeIF tipoRetorno) {
		super(scope, name, parametros);
		this.tipoRetorno = tipoRetorno;
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

    public TypeIF getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(TypeIF tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }
}
