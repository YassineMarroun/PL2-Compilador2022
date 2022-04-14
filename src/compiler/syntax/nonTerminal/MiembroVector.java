package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import compiler.semantic.symbol.SymbolConstantEntero;
import compiler.semantic.type.TypeArray;
import compiler.semantic.type.TypeEntero;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.SemanticErrorManager;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class MiembroVector extends NonTerminal {
    
    private String identificador;
    private ValorRango valorRango;
    private TypeIF tipoMiembroVector;

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

    public TypeIF getTipoMiembroVector() {
        return tipoMiembroVector;
    }

    public void setTipoMiembroVector(TypeIF tipoMiembroVector) {
        this.tipoMiembroVector = tipoMiembroVector;
    }


    public void comprobarMiembroVector() {

        ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
        SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager();

        // Se busca el identificador en la Tabla de Símbolos
        ScopeIF ambito = scopeManager.getCurrentScope();
        SymbolTableIF simbolosTabla = ambito.getSymbolTable();

        if(!simbolosTabla.containsSymbol(identificador)) {
            semanticErrorManager.semanticFatalError("Error semantico: identificador " + identificador + " no esta declarado");
        }

        SymbolIF simbolo = simbolosTabla.getSymbol(identificador);
        if(!(simbolo.getType() instanceof TypeArray)) {
            semanticErrorManager.semanticFatalError("Error semantico: el tipo " + simbolo.getType().getName() + " no es de tipo vector");
        }

        TypeArray tipoVector = (TypeArray)simbolo.getType();
        tipoMiembroVector = tipoVector.getTipo();

        // Se comprueba valorRango
        if(valorRango.isEsValorEntero()) {
            // Si es un número, tiene que estar entre rango1 y rango2 de tipoVector
            int valor = valorRango.getNumero();
            if(valor < tipoVector.getRango1() || valor > tipoVector.getRango2()) {
                semanticErrorManager.semanticFatalError("Error semantico: acceso a la variable vector " + identificador + " tiene un rango incorrecto: " + valor);
            }
        } else if(valorRango.isEsSimbolo()) {
            // Si es un símbolo el tipo tiene que ser entero
            SymbolIF simboloValor = valorRango.getSimbolo();
            if(simboloValor.getType() instanceof TypeEntero) {
                // Si es un símbolo constante, se comprueba el valor
                if(simboloValor instanceof SymbolConstantEntero) {
                    int valor = ((SymbolConstantEntero)simboloValor).getValorEntero();
                    if(valor < tipoVector.getRango1() || valor > tipoVector.getRango2()) {
                        semanticErrorManager.semanticFatalError("Error semantico: acceso a la variable vector " + identificador + " tiene rango incorrecto: " + valor);
                    }
                }
            } else {
                semanticErrorManager.semanticFatalError("Error semantico: acceso a la variable vector " + identificador + ", indice no entero");
            }
        } else {
            // El índice es otro miembro vector
            String idMiembroVector = valorRango.getMiembroVector().getIdentificador();
            SymbolIF simboloVector = simbolosTabla.getSymbol(idMiembroVector);
            TypeArray tipoMiembroVector = (TypeArray)simboloVector.getType();
            // El tipo base del vector tiene que ser entero
            if(!(tipoMiembroVector.getTipo() instanceof TypeEntero)) {
                semanticErrorManager.semanticFatalError("Error semantico: acceso a la variable vector " + identificador + ", indice tipo vector no entero");
            }
        }
    }
}
