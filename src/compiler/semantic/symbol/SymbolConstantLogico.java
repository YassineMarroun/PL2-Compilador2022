package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SymbolConstantLogico extends SymbolConstant{
	private boolean valorLogico;

	public SymbolConstantLogico(ScopeIF scope, String name, TypeIF type, boolean valorLogico) {
		super(scope, name, type);
		this.valorLogico = valorLogico;
	}

	public boolean getValorLogico() {
		return valorLogico;
	}

	public void setValorLogico(boolean valorLogico) {
		this.valorLogico = valorLogico;
	}
}
