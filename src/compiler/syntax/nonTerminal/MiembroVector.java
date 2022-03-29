package compiler.syntax.nonTerminal;

import java.lang.ProcessBuilder.Redirect.Type;

import compiler.CompilerContext;
import compiler.semantic.type.TypeArray;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;

public class MiembroVector extends NonTerminal {
    
    private String identificador;
    private ValorRango valorRango;

    public MiembroVector(String identificador, ValorRango valorRango) {
        super();
        this.identificador = identificador;
        this.valorRango = valorRango;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ValorRango getValorRango() {
        return valorRango;
    }

    public void setValorRango(ValorRango valorRango) {
        this.valorRango = valorRango;
    }

    public void comprobarMiembroVector() {

        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        // Se busca el identificador en la Tabla de Símbolos
        ScopeIF ambito = scopeManager.getCurrentScope();
        SymbolTableIF simbolosTabla = ambito.getSymbolTable();

        if(!simbolosTabla.containsSymbol(identificador)) {
            semanticErrorManager.semanticFatalError("Error semántico: identificador " + identificador + " no está declarado");
        }

        SymbolIF simbolo = simbolosTabla.getSymbol(identificador);
        if(!(simbolo.getType() instanceof TypeArray)) {
            semanticErrorManager.semanticFatalError("Error semántico: el tipo " + simbolo.getType().getName() + " no es de tipo vector");
        }

        TypeArray tipoVector = (TypeArray) simbolo.getType();

        // Se comprueba valorRango
        if(valorRango.isEsValorEntero()) {
            // Si es un número, tiene que estar entre rango1 y rango2 de tipoVector
            int valor = valorRango.getNumero();
            if(valor < tipoVector.getRango1() || valor > tipoVector.getRango2()) {
                semanticErrorManager.semanticFatalError("Error semántico: acceso a la variable");
            } else if (valorRango.isEsSimbolo()) {
                
            }
        }

        // ValorRango tiene que ser del mismo tipo que el vector
    }
}
