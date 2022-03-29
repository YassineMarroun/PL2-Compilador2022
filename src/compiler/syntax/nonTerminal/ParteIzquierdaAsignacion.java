package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ParteIzquierdaAsignacion extends NonTerminal {
    
    private TypeIF tipoIzquierdo;

    public ParteIzquierdaAsignacion(TypeIF tipoIzquierdo) {
        super();
        this.tipoIzquierdo = tipoIzquierdo;
    }

    public TypeIF getTipoIzquierdo() {
        return tipoIzquierdo;
    }

    public void setTipoIzquierdo(TypeIF tipoIzquierdo) {
        this.tipoIzquierdo = tipoIzquierdo;
    }
}
