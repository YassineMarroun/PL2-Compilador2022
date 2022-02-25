package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class ListSentencia extends NonTerminal {

	private List<Sentencia> sentenciaList = new ArrayList<>();
	
	// Constructor ListSentencia vacío
	public ListSentencia() {
		super();
	}

	// Constructor ListSentencia pasándole Sentencia
	public ListSentencia(Sentencia sentencia) {
		super();
		this.sentenciaList.add(sentencia);
	}

	// Devuelve sentenciaList
	public List<Sentencia> getSentenciaList() {
		return sentenciaList;
	}
	
	// Modifica sentenciaList
	public void addSentencia(Sentencia sentencia) {
		this.sentenciaList.add(sentencia);
	}
}
