package compiler.syntax.nonTerminal;

public class ValorConstante extends NonTerminal {
	
	private int valorEntero;
	private boolean valorLogico;
	private boolean esValorEntero;
	
	public ValorConstante(int valorEntero) {
		super();
		this.valorEntero = valorEntero;
		this.esValorEntero = true;
	}

	public ValorConstante(boolean valorLogico) {
		super();
		this.valorLogico = valorLogico;
		this.esValorEntero = false;
	}

	public int getValorEntero() {
		return valorEntero;
	}

	public void setValorEntero(int valorEntero) {
		this.valorEntero = valorEntero;
	}

	public boolean getValorLogico() {
		return valorLogico;
	}

	public void setValorLogico(boolean valorLogico) {
		this.valorLogico = valorLogico;
	}

	public boolean isEsValorEntero() {
		return esValorEntero;
	}

	public void setEsValorEntero(boolean esValorEntero) {
		this.esValorEntero = esValorEntero;
	}	
}
