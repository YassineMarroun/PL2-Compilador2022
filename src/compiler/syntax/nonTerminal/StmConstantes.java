package compiler.syntax.nonTerminal;

public class StmConstantes extends NonTerminal {
	
	private SentConst sentConst;

	// Constructor StmConstantes vacío
	public StmConstantes() {
		super();
	}
	
	//Constructor StmConstantes pasándole SentConst
	public StmConstantes(SentConst sentConst) {
		super();
		this.sentConst = sentConst;
	}

	// Devuelve sentConst
	public SentConst getSentConst() {
		return sentConst;
	}

	// Modifica sentConst
	public void setSentConst(SentConst sentConst) {
		this.sentConst = sentConst;
	}	
}
