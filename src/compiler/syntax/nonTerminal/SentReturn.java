package compiler.syntax.nonTerminal;

public class SentReturn extends NonTerminal {

	private Expresion expresion;
	
	// Constructor SentReturn pasándole Expresion
	public SentReturn(Expresion expresion) {
		super();
		this.expresion = expresion;
	}

	// Devuelve expresion
	public Expresion getExpresion() {
		return expresion;
	}

	// Modifica expresion
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}	
}
