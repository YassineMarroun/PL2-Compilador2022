package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SymbolConstantEntero extends SymbolConstant {
	
	private int valorEntero;
	
	public SymbolConstantEntero(ScopeIF scope, String name, TypeIF type, int valorEntero) {
		super(scope, name, type);
		this.valorEntero = valorEntero;
	}

	public int getValorEntero() {
		return valorEntero;
	}

	public void setValorEntero(int valorEntero) {
		this.valorEntero = valorEntero;
	}
}
