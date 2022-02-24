package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ProcParam extends NonTerminal {
	
	private CadIdVar cadIdVar;
	private TypeIF tipoVar;

	// Constructor ProcParam pasándole CadIdVar y TypeIF
	public ProcParam(CadIdVar cadIdVar, TypeIF tipoVar) {
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
