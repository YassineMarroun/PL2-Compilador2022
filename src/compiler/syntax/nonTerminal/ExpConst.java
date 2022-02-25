package compiler.syntax.nonTerminal;

public class ExpConst extends NonTerminal {

	private String identificador;
	private Object valorConst;
	
	// Constructor ExpConst pasándole String y Object
	public ExpConst(String identificador, Object valorConst) {
		super();
		this.identificador = identificador;
		this.valorConst = valorConst;
	}

	// Devuelve identificador
	public String getIdentificador() {
		return identificador;
	}

	// Modifica identificador
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	// Devuelve valorConst
	public Object getValorConst() {
		return valorConst;
	}
	
	// Modifica valorConst
	public void setValorConst(Object valorConst) {
		this.valorConst = valorConst;
	}
}
