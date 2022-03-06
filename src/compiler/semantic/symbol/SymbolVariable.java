package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */
public class SymbolVariable
    extends SymbolBase
{
    private int direccionMemoria;
    
    /**
     * Constructor for SymbolVariable.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolVariable (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    }

    public int getDireccionMemoria() {
        return direccionMemoria;
    }

    public void setDireccionMemoria(int direccionMemoria) {
        this.direccionMemoria = direccionMemoria;
    }
}
