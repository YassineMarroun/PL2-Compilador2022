package compiler.syntax.nonTerminal;

import compiler.semantic.type.TypeSimple;

public class TipoRetorno extends NonTerminal {

	private TypeSimple intOBool;
	
	// Constructor TipoRetorno vacío
	public TipoRetorno() {
		super();
	}
	
	// Constructor TipoRetorno pasándole TypeSimple
	public TipoRetorno(TypeSimple intOBool) {
		super();
		this.intOBool = intOBool;
	}

	// Devuelve intOBool
	public TypeSimple getIntOBool() {
		return intOBool;
	}

	// Modifica intOBool
	public void setIntOBool(TypeSimple intOBool) {
		this.intOBool = intOBool;
	}
}
