package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ExpVar extends NonTerminal {

	private CadIdVar cadIdVar;
	private TypeIF tipoVar;
	
	// Constructor ExpVar pasándole CadIdVar y TypeIF
	public ExpVar(CadIdVar cadIdVar, TypeIF tipoVar) {
		super();
		this.cadIdVar = cadIdVar;
		this.tipoVar = tipoVar;
	}

	// Devuelve cadIdVar
	public CadIdVar getCadIdVar() {
		return cadIdVar;
	}

	// Modifica cadIdVar
	public void setCadIdVar(CadIdVar cadIdVar) {
		this.cadIdVar = cadIdVar;
	}

	// Devuelve tipoVar
	public TypeIF getTipoVar() {
		return tipoVar;
	}

	// Modifica tipoVar
	public void setTipoVar(TypeIF tipoVar) {
		this.tipoVar = tipoVar;
	}
}
