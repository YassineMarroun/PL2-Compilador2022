package compiler.syntax.nonTerminal;

public class ExLogica extends NonTerminal {

	private Boolean valor;
	private String operacion;
	private Expresion expresion1;
	private Expresion expresion2;
	
	// Constructor ExLogica pasándole String, Expresion y Expresion
	public ExLogica(String operacion, Expresion expresion1, Expresion expresion2) {
		super();
		this.operacion = operacion;
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
	
	// Constructor ExLogica pasándole boolean
	public ExLogica(boolean valor) {
		this.valor = valor;
	}
	
	// Constructor ExLogica pasándole String y Expresion 
	public ExLogica(String operacion,Expresion expresion1) {
		super();	
		this.operacion = operacion;
		this.expresion1 = expresion1;
	}
	
	// Devuelve el resultado de ExLogica
	public boolean getResultado() {
		//Si valor no es nulo, la expresión es un booleano
		if(this.valor != null) {
			return (boolean)valor;
		//Si no, se comprueba que operación es y se realiza el cálculo
		} else {
			switch(this.operacion) {
				case ">":
					return (int)this.expresion1.getValor() > (int)this.expresion2.getValor();
				case "=":
					return (int)this.expresion1.getValor() == (int)this.expresion2.getValor();
				case "OR":
					return (boolean)this.expresion1.getValor() || (boolean)this.expresion2.getValor();
				case "NOT":
					return !((boolean)this.expresion1.getValor());
				default:
					throw new RuntimeException("ERROR INESPERADO");
			}
		}
	}

	// Devuelve valor
	public Boolean getValor() {
		return valor;
	}

	// Modifica valor
	public void setValor(Boolean valor) {
		this.valor = valor;
	}

	// Devuelve operacion
	public String getOperacion() {
		return operacion;
	}

	// Modifica operacion
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	//Devuelve expresion1
	public Expresion getExpresion1() {
		return expresion1;
	}

	// Modifica expresion1
	public void setExpresion1(Expresion expresion1) {
		this.expresion1 = expresion1;
	}

	// Devuelve expresion2
	public Expresion getExpresion2() {
		return expresion2;
	}

	// Modifica expresion2
	public void setExpresion2(Expresion expresion2) {
		this.expresion2 = expresion2;
	}	
}
