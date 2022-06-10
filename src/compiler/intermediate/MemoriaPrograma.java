package compiler.intermediate;

import java.util.HashMap;
import java.util.List;
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
    public static int sizePrincipal = 0;
    public static HashMap<String, Integer> ambitosSize = new HashMap<String, Integer>();
 
    public static int sizeAmbito(String ambito) {
        return ambitosSize.get(ambito);
    }

    public void asignarMemoria() {

        int direccionLocal = 1;
        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();

        // Se recuperan todos los ambitos
        List<ScopeIF> ambitos = scopeManager.getAllScopes();

        for(ScopeIF ambito : ambitos) {

            // Se inicializa la dirección local del ámbito
            direccionLocal = 1;
            String ambitoNombre = ambito.getName();

            // Direcciones de memoria para las variables
            SymbolTableIF tablaSimbolosPrincipal = ambito.getSymbolTable();
            for(SymbolIF simbolo : tablaSimbolosPrincipal.getSymbols()) {
                
                if(simbolo instanceof SymbolVariable) {
                    
                    if(ambito.getLevel() == 0) {
                        // Si es el ámbito principal, la dirección es global
                        SymbolVariable simboloVariable = (SymbolVariable)simbolo;
                        simboloVariable.setDireccionMemoria(direccionInicio);
                        direccionInicio += simboloVariable.getType().getSize();
                    } else {
                        // Si es un subprograma la dirección es local
                        SymbolVariable simboloVariable = (SymbolVariable)simbolo;
                        simboloVariable.setDireccionMemoria(direccionLocal);
                        direccionLocal += simboloVariable.getType().getSize();
                    }    
                }
            }

            // Direcciones de memoria para los temporales: direcciones locales
            TemporalTableIF tablaTemporales = ambito.getTemporalTable();
            for(TemporalIF temporal : tablaTemporales.getTemporals()) {
            	
                if(ambito.getLevel() == 0) {
                    temporal.setAddress(direccionInicio);
                    direccionInicio++;
                } else {
                    temporal.setAddress(direccionLocal);
                    direccionLocal++;
                }
            }

            // Se añade el ámbito y su tamaño en el HashMap
            ambitosSize.put(ambitoNombre, direccionLocal);
        
            if(ambito.getLevel() == 0) {
                MemoriaPrograma.sizePrincipal = direccionLocal;
            }
        }    
        
        inicioTextos = direccionInicio;
        // Direcciones de memoria para los textos
        HashMap<String, String> textos = Textos.getTextos();
        for(Entry<String, String> e : textos.entrySet()) {
            direccionInicio += e.getValue().length();
        }
    } 
}
