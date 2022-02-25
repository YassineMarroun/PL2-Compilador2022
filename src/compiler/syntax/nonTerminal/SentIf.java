package compiler.syntax.nonTerminal;

public class SentIf extends NonTerminal {
	private Expresion expresion;
	private Sentencias sentencias;
	private SentElse sentElse;
	
	// Constructor SentIf pasándole Expresion, Sentencias y SentElse
	public SentIf(Expresion expresion,Sentencias sentencias,SentElse sentElse) {
		super();
		this.expresion = expresion;
		this.sentencias = sentencias;
		this.sentElse = sentElse;
	}

	// Devuelve expresion
	public Expresion getExpresion() {
		return expresion;
	}

	// Modifica expresion
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	// Devuelve sentencias
	public Sentencias getSentencias() {
		return sentencias;
	}

	// Modifica sentencias
	public void setSentencias(Sentencias sentencias) {
		this.sentencias = sentencias;
	}

	//Devuelve sentElse
	public SentElse getSentElse() {
		return sentElse;
	}

	// Modifica sentElse
	public void setSentElse(SentElse sentElse) {
		this.sentElse = sentElse;
	}	
}
