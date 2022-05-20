package compiler.semantic.symbol;

import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

public class SymbolParameter
    extends SymbolBase
{  
   
    private boolean pasoReferencia = false;
    private int direccionMemoria = 0;
    private TemporalIF temporal;

    /**
     * Constructor for SymbolParameter.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolParameter (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    }

    public SymbolParameter(ScopeIF scope, String name, TypeIF type, boolean pasoReferencia, int direccionMemoria, TemporalIF temporal) {
        super(scope, name, type);
        this.pasoReferencia = pasoReferencia;
        this.direccionMemoria = direccionMemoria;
        this.temporal = temporal;
    }

    public boolean isPasoReferencia() {
        return pasoReferencia;
    }

    public void setPasoReferencia(boolean pasoReferencia) {
        this.pasoReferencia = pasoReferencia;
    }

    public int getDireccionMemoria() {
        return direccionMemoria;
    }

    public void setDireccionMemoria(int direccionMemoria) {
        this.direccionMemoria = direccionMemoria;
    }
    
    public TemporalIF getTemporal() {
        return temporal;
    }

    public void setTemporal(TemporalIF temporal) {
        this.temporal = temporal;
    }
}
