package compiler.syntax.nonTerminal;

public class ProcParenParam extends NonTerminal {

	private ProcListParam procListParam;
	
	// Constructor ProcParenParam vacío
	public ProcParenParam() {
		super();
		this.procListParam = new ProcListParam();
	}
	
	// Constructor ProcParenParam pasándole ProcListParam
	public ProcParenParam(ProcListParam procListParam) {
		super();
		this.procListParam = procListParam;
	}

	// Devuelve procListParam
	public ProcListParam getProcListParam() {
		return procListParam;
	}

	// Modifica procListParam
	public void setProcListParam(ProcListParam procListParam) {
		this.procListParam = procListParam;
	}	
}
