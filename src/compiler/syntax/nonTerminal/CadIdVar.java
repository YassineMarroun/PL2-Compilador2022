package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class CadIdVar extends NonTerminal {

	private List<String> idList;
	
	// Constructor CadIdVar pasándole String
	public CadIdVar(String identificador) {
		super();
		this.idList = new ArrayList<String>();
		this.idList.add(identificador);
	}

	// Devuelve idList
	public List<String> getIdList() {
		return idList;
	}

	// Modifica idList
	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
	
	// Añade String a idList
	public void addIdentificador(String identificador) {
		this.idList.add(identificador);
	}
}
