package compiler.syntax.nonTerminal;

public class StmVar extends NonTerminal {

	private SentVar sentVar;

	// Constructor StmVar vacío
	public StmVar() {
		super();
	}
	
	// Constructor StmVar pasándole SentVar
	public StmVar(SentVar sentVar) {
		super();
		this.sentVar = sentVar;
	}

	// Devuelve sentVar
	public SentVar getSentVar() {
		return sentVar;
	}

	// Modifica sentVar
	public void setSentVar(SentVar sentVar) {
		this.sentVar = sentVar;
	}
}
