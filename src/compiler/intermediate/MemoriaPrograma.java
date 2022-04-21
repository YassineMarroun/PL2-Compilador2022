package compiler.intermediate;

import java.util.HashMap;
import java.util.Map.Entry;

import compiler.CompilerContext;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.intermediate.TemporalTableIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;

public class MemoriaPrograma {

    public int sizeTextos = 0;
    public int direccionInicio = 2;

    public void asignarMemoria() {

        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        //Se recupera el ámbito principal
        ScopeIF ambitoPrincipal = scopeManager.getScope(0);

        // Direcciones de memoria para los temporales
        TemporalTableIF tablaTemporalesPrincipal = ambitoPrincipal.getTemporalTable();

        for(TemporalIF temporal : tablaTemporalesPrincipal.getTemporals()) {

        }

        // Direcciones de memoria para los textos
        HashMap<String, String> textos = Textos.getTextos();
        for(Entry<String, String> e : textos.entrySet()) {
            sizeTextos = sizeTextos + e.
        }
    } 


}
