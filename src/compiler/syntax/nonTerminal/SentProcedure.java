package compiler.syntax.nonTerminal;

public class SentProcedure extends NonTerminal {

	private String identificador;
	private ParFuncion parFuncion;
	
	// Constructor SentProcedure pasándole String
	public SentProcedure(String identificador) {
		super();
		this.identificador = identificador;
	}
	
	// Constructor SentProcedure con String y ParFuncion
	public SentProcedure(String identificador, ParFuncion parFuncion) {
		super();
		this.identificador = identificador;
		this.parFuncion = parFuncion;
	}

	// Devuelve identificador
	public String getIdentificador() {
		return identificador;
	}

	// Modifica identificador
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
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
