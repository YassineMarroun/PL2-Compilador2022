package compiler.syntax.nonTerminal;

public class SentElse extends NonTerminal {

	private Sentencias sentencias;
	
	// Constructor SentElse vacío
	public SentElse() {
	}
	
	// Constructor SentElse pasándole Sentencias
	public SentElse(Sentencias sentencias) {
		super();
		this.sentencias = sentencias;
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
