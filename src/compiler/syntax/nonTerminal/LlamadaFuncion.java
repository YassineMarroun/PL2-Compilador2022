package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import compiler.CompilerContext;
import compiler.semantic.symbol.SymbolVariable;
import compiler.semantic.type.TypeProcedure;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class LlamadaFuncion {
    
    private TypeProcedure tipoSubprograma;
    private ArrayList<SelectorValorOReferencia> parametrosLlamada;

    public LlamadaFuncion(TypeProcedure tipoPrograma, ArrayList<SelectorValorOReferencia> parametrosLlamada) {
        super();
        this.tipoSubprograma = tipoPrograma;
        this.parametrosLlamada = parametrosLlamada;
    }

    public void comprobarLlamada() {

        ArrayList<SymbolVariable>  parametrosDeclaracion = tipoSubprograma.getParametros();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        if(parametrosDeclaracion.size() != parametrosLlamada.size()) {
            semanticErrorManager.semanticFatalError("Error semántico: número de parámetros incorrectos en la llamada a la función");
        } else {
            // Comparar uno a uno los tipos de los dos ArrayList
            for(int i = 0; i < parametrosDeclaracion.size(); i++) {
                TypeIF tipoDeclaracion = parametrosDeclaracion.get(i).getType();
                Expresion expresionLlamada = parametrosLlamada.get(i).getExpresion();
                TypeIF tipoLlamada = expresionLlamada.getTipo();

                // Los nomsbres de los tipos tienen que ser iguales
                if(!tipoDeclaracion.getName().equalsIgnoreCase(tipoLlamada.getName())) {
                    semanticErrorManager.semanticFatalError("Error semántico: tipo incorrecto en los parámetros de la llamada a la función");
                }
            }
        }
    }

    public TypeProcedure getTipoSubprograma() {
        return tipoSubprograma;
    }

    public void setTipoSubprograma(TypeProcedure tipoSubprograma) {
        this.tipoSubprograma = tipoSubprograma;
    }

    public ArrayList<SelectorValorOReferencia> getParametrosLlamada() {
        return parametrosLlamada;
    }

    public void setParametrosLlamada(ArrayList<SelectorValorOReferencia> parametrosLlamada) {
        this.parametrosLlamada = parametrosLlamada;
    }
}
