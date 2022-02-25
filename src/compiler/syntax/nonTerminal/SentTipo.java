package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import compiler.semantic.type.TypeArray;

public class SentTipo extends NonTerminal {

	private List<TypeArray> expTipoList;
	
	// Constructor SentTipo pasándole TypeArray
	public SentTipo(TypeArray expTipo) {
		super();
		this.expTipoList = new ArrayList<TypeArray>();
		expTipoList.add(expTipo);
	}

	// Devuelve expTipoList
	public List<TypeArray> getExpTipoList() {
		return expTipoList;
	}

	// Modifica expTipoList
	public void setExpTipoList(List<TypeArray> expTipoList) {
		this.expTipoList = expTipoList;
	}
	
	// Añade TypeArray a ExpTipoList
	public void addExpTipo(TypeArray expTipo) {
		expTipoList.add(expTipo);
	}
}
