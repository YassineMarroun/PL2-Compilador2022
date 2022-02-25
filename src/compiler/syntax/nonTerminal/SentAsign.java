package compiler.syntax.nonTerminal;

public class SentAsign extends NonTerminal {

	private Variables variables;
	private Expresion expresion;
	
	// Constructor SentAsign pasándole Variables y Expresion
	public SentAsign(Variables variables, Expresion expresion) {
		super();
		this.variables = variables;
		this.expresion = expresion;
	}

	// Devuelve variables
	public Variables getVariables() {
		return variables;
	}

	// Modifica variables
	public void setVariables(Variables variables) {
		this.variables = variables;
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
