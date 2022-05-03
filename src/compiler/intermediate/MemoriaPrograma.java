package compiler.intermediate;

import java.util.HashMap;
import java.util.Map.Entry;
import compiler.CompilerContext;
import compiler.semantic.symbol.SymbolVariable;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.intermediate.TemporalTableIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;

public class MemoriaPrograma {

    public int sizeTextos = 0;
    public int direccionInicio = 2;
    public int inicioTextos = 2;

    public void asignarMemoria() {

        //Se recupera el ámbito principal
        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        ScopeIF ambitoPrincipal = scopeManager.getScope(0);

        // Direcciones de memoria para las variables
        SymbolTableIF tablaSimbolosPrincipal = ambitoPrincipal.getSymbolTable();
        for(SymbolIF simbolo : tablaSimbolosPrincipal.getSymbols()) {
            // Los únicos símbolos con dirección de memoria son las variables
            if(simbolo instanceof SymbolVariable) {
                SymbolVariable simboloVariable = (SymbolVariable)simbolo;
                simboloVariable.setDireccionMemoria(direccionInicio);
                direccionInicio += simboloVariable.getType().getSize();
            }
        }

        // Direcciones de memoria para los temporales
        TemporalTableIF tablaTemporalesPrincipal = ambitoPrincipal.getTemporalTable();
        for(TemporalIF temporal : tablaTemporalesPrincipal.getTemporals()) {
            	temporal.setAddress(direccionInicio);
                direccionInicio++;
        }
        inicioTextos = direccionInicio;

        // Direcciones de memoria para los textos
        HashMap<String, String> textos = Textos.getTextos();
        for(Entry<String, String> e : textos.entrySet()) {
            direccionInicio += e.getValue().length();
        }
    } 
}
