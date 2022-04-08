package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import compiler.semantic.type.TypeProcedure;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;

import java.util.ArrayList;

public class LlamadaFuncion {
    
    private TypeProcedure tipoSubprograma;
    private ArrayList<SelectorValorOReferencia> parametros;

    public LlamadaFuncion(TypeProcedure tipoPrograma, ArrayList<SelectorValorOReferencia> parametros) {
        super();
        this.tipoSubprograma = tipoPrograma;
        this.parametros = parametros;
    }

    public void comprobarLlamada() {

        ArrayList<SymbolVariable>  parametrosDeclaracion = tipoSubprograma.getParametros();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        
        if(parametrosDeclaracion.size() != parametrosLlamada.size()) {
            semanticErrorManager.semanticFatalError("Error semántico: numero de parametros incorrectos en la llamada a la función");
        } else {
            // Comparar uno a uno los tipos de los dos ArrayList
            for(int i = 0; i < parametrosDeclaracion.size(); i++) {
                TypeIF tipoDeclaracion = parametrosDeclaracion.get(i).getType();
                
            }
        }
    }
}
