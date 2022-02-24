package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Expresion extends NonTerminal {

	private ExAritmetica exAritmetica;
	private ExLogica exLogica;
	private Variables variables;
	private List<Expresion> expresionList = new ArrayList<>();;
	

	// Constructor para ExAritmetica
	public Expresion(ExAritmetica exAritmetica) {
		super();
		this.exAritmetica = exAritmetica;
	}
	
	// Constructor para ExLogica
	public Expresion(ExLogica exLogica) {
		super();
		this.exLogica = exLogica;
	}
	
	/*
	 * Constructor Expresion con Variables
	 */
	public Expresion(Variables variables) {
		super();
		this.variables = variables;
	}
	
	/*
	 * Constructor Expresion con expresion
	 */
	public Expresion(Expresion expresion) {
		super();
		this.expresionList.add(expresion);
	}

	// Devuelve exAritmetica
	public ExAritmetica getExAritmetica() {
		return exAritmetica;
	}
	
	// Modifica exAritmetica
	public void setExAritmetica(ExAritmetica exAritmetica) {
		this.exAritmetica = exAritmetica;
	}

	// Devuelve exLogica
	public ExLogica getExLogica() {
		return exLogica;
	}

	// Modifica exLogica
	public void setExLogica(ExLogica exLogica) {
		this.exLogica = exLogica;
	}

	/*
	 * Devuelve variables
	 */
	public Variables getVariables() {
		return variables;
	}

	/*
	 * Modifica variables
	 */
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	
	/*
	 * Devuelve expresionList
	 */
	public List<Expresion> getExpresionList() {
		return expresionList;
	}

	/*
	 * Modifica expresionList
	 */
	public void setExpresionList(List<Expresion> expresionList) {
		this.expresionList = expresionList;
	}
	
	/*
	 * Añade expresion a expresionList
	 */
	public void addExpresion(Expresion expresion) {
		this.expresionList.add(expresion);
	}
	
	// Comprueba si la expresión es aritmética o lógica y devuelve su valor
	public Object getValor() {
		if(this.exAritmetica != null) {
			return exAritmetica.getResultado();
		}
		if(this.exLogica != null) {
			return exLogica.getResultado();
		}
		return null;
	}	
}
