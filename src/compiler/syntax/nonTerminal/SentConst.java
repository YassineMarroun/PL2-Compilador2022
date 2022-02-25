package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class SentConst extends NonTerminal {

	private List<ExpConst> expConstList;
	
	// Constructor SentConst pasándole expConst
	public SentConst(ExpConst expConst) {
		super();
		this.expConstList = new ArrayList<ExpConst>();
		expConstList.add(expConst);
	}

	// Devuelve expConstList
	public List<ExpConst> getExpConstList() {
		return expConstList;
	}

	// Modifica expConstList
	public void setExpConstList(List<ExpConst> expConstList) {
		this.expConstList = expConstList;
	}
	
	// Añade ExpConst a expConstList
	public void addExpConst(ExpConst expConst) {
		expConstList.add(expConst);
	}
}
