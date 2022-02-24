package compiler.syntax.nonTerminal;

public class ParFuncion extends NonTerminal {

	private Parametros parametros;
	
	// Constructor ParFuncion vacío
	public ParFuncion() {
		super();
	}
	
	// Constructor ParFuncion pasándole Parametros
	public ParFuncion(Parametros parametros) {
		super();
		this.parametros = parametros;
	}

	// Devuelve Parametros
	public Parametros getParametros() {
		return parametros;
	}

	// Modifica Parametros
	public void setParametros(Parametros parametros) {
		this.parametros = parametros;
	}
}
