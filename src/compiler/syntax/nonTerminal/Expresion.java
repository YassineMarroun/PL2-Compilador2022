package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
    
    private String identificador;
    private boolean esIdentificador;
    private TypeIF tipo;

    public Expresion(String identificador) {

        super();
        this.identificador = identificador;
        this.esIdentificador = true;
    }

    public Expresion(TypeIF tipo) {

        super();
        this.tipo = tipo;
        this.esIdentificador = false;
    }

    public TypeIF getTipo() {
        return tipo;
    }

    public void setTipo(TypeIF tipo) {
        this.tipo = tipo;
    }
    public TypeIF getTipoExpresion() {
        
        if(esIdentificador) {
                
        }
    }
}
