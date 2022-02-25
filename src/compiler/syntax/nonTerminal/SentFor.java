package compiler.syntax.nonTerminal;

public class SentFor extends NonTerminal {

	private String identificador;
	private Expresion inicio;
	private Expresion fin;
	private Sentencias sentencias;
	
	// Constructor SentFor pasándole String, Expresion, Expresion y Sentencias
	public SentFor(String identificador, Expresion inicio, Expresion fin, Sentencias sentencias) {
		super();
		this.identificador = identificador;
		this.inicio = inicio;
		this.fin = fin;
		this.sentencias = sentencias;
	}

	// Devuelve identificador
	public String getIdentificador() {
		return identificador;
	}

	// Modifica identificador
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	// Devuelve inicio
	public Expresion getInicio() {
		return inicio;
	}

	// Modifica inicio
	public void setInicio(Expresion inicio) {
		this.inicio = inicio;
	}

	// Devuelve fin
	public Expresion getFin() {
		return fin;
	}

	// Modifica fin
	public void setFin(Expresion fin) {
		this.fin = fin;
	}

	// Devuelve sentencias
	public Sentencias getSentencias() {
		return sentencias;
	}

	// Modifica sentencias
	public void setSentencias(Sentencias sentencias) {
		this.sentencias = sentencias;
	}
}
