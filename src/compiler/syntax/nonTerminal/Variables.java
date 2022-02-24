package compiler.syntax.nonTerminal;

public class Variables extends NonTerminal {

	private String identificador;
	private IdArray idArray;
	private ParFuncion parFuncion;
	
	// Constructor Variables pasándole String
	public Variables(String identificador) {
		super();
		this.identificador = identificador;
	}
	
	// Constructor Variables pasándole String y ParFuncion
	public Variables(String identificador, ParFuncion parFuncion) {
		super();
		this.identificador = identificador;
		this.parFuncion = parFuncion;
	}
	
	// Constructor Variables pasándole String y IdArray
	public Variables(String identificador, IdArray idArray) {
		super();
		this.identificador = identificador;
		this.idArray = idArray;
	}

	// Devuelve identificador
	public String getIdentificador() {
		return identificador;
	}

	// Modifica identificador
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	// Devuelve idArray
	public IdArray getIdArray() {
		return idArray;
	}

	// Modifica idArray
	public void setIdArray(IdArray idArray) {
		this.idArray = idArray;
	}

	// Devuelve parFuncion
	public ParFuncion getParFuncion() {
		return parFuncion;
	}

	// Modifica parFuncion
	public void setParFuncion(ParFuncion parFuncion) {
		this.parFuncion = parFuncion;
	}	
}
