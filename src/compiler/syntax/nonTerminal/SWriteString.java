package compiler.syntax.nonTerminal;

public class SWriteString extends NonTerminal {

	private String cadena;
	
	// Constructo SWriteString pasándole String
	public SWriteString(String cadena) {
		super();
		this.cadena = cadena;
	}

	// Devuelve cadena
	public String getCadena() {
		return cadena;
	}

	// Modifica cadena
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
}
