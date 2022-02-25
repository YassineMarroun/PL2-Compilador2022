package compiler.syntax.nonTerminal;

public class Sentencia extends NonTerminal {

	private TypeSentencia type;
	private SentProcedure sentProcedure;
	private SentAsign sentAsign;
	private SentReturn sentReturn;
	private SentIf sentIf;
	private SentFor sentFor;
	private SWriteString sWriteString;
	private SWriteInt sWriteInt;
	private SWriteLn sWriteLn;
	
	// Constructor Sentencia pasándole SentProcedure
	public Sentencia(SentProcedure sentProcedure) {
		super();
		this.sentProcedure = sentProcedure;
		this.type = TypeSentencia.PROCEDURE;
	}
	
	// Constructor Sentencia pasándole SentAsign
	public Sentencia(SentAsign sentAsign) {
		super();
		this.sentAsign = sentAsign;
		this.type = TypeSentencia.ASIGN;
	}
	
	// Constructor Sentencia pasándole SentReturn
	public Sentencia(SentReturn sentReturn) {
		super();
		this.sentReturn = sentReturn;
		this.type = TypeSentencia.RETURN;
	}
	
	// Constructor Sentencia pasándole SentIf
	public Sentencia(SentIf sentIf) {
		super();
		this.sentIf = sentIf;
		this.type = TypeSentencia.IF;
	}
	
	// Constructor Sentencia pasándole SentFor
	public Sentencia(SentFor sentFor) {
		super();
		this.sentFor = sentFor;
		this.type =TypeSentencia.FOR;
	}
	
	// Constructor Sentencia pasándole SWriteString
	public Sentencia(SWriteString sWriteString) {
		super();
		this.sWriteString = sWriteString;
		this.type = TypeSentencia.WRITESTRING;
	}
	
	// Constructor Sentencia pasándole SWriteInt
	public Sentencia(SWriteInt sWriteInt) {
		super();
		this.sWriteInt = sWriteInt;
		this.type = TypeSentencia.WRITEINT;
	}
	
	// Constructor Sentencia pasándole SWriteLn
	public Sentencia(SWriteLn sWriteLn) {
		super();
		this.sWriteLn = sWriteLn;
		this.type = TypeSentencia.WRITELN;
	}
	
	// Enum para indicar los tipos de Sentencia
	public enum TypeSentencia {
		PROCEDURE, ASIGN, RETURN, IF, FOR, WRITESTRING, WRITEINT, WRITELN
	}
	
	// Devuelve el tipo de la Sentencia
	public TypeSentencia getType() {
		return this.type;
	}
	
	// Modifca el tipo de la Sentencia
	public void setType(TypeSentencia type) {
		this.type = type;
	}
	
	// Devuelve sentProcedure
	public SentProcedure getSentProcedure() {
		return sentProcedure;
	}

	// Modifica sentProcedure
	public void setSentProcedure(SentProcedure sentProcedure) {
		this.sentProcedure = sentProcedure;
	}

	// Devuelve sentAsign
	public SentAsign getSentAsign() {
		return sentAsign;
	}

	// Modifica sentAsign
	public void setSentAsign(SentAsign sentAsign) {
		this.sentAsign = sentAsign;
	}

	// Devuelve sentReturn
	public SentReturn getSentReturn() {
		return sentReturn;
	}

	// Modifica sentReturn
	public void setSentReturn(SentReturn sentReturn) {
		this.sentReturn = sentReturn;
	}

	// Devuelve sentIf
	public SentIf getSentIf() {
		return sentIf;
	}

	// Modifica sentIf
	public void setSentIf(SentIf sentIf) {
		this.sentIf = sentIf;
	}

	// Devuelve sentFor
	public SentFor getSentFor() {
		return sentFor;
	}

	// Modifica sentFor
	public void setSentFor(SentFor sentFor) {
		this.sentFor = sentFor;
	}

	// Devuelve sWriteString
	public SWriteString getsWriteString() {
		return sWriteString;
	}

	// Modifica sWriteString
	public void setsWriteString(SWriteString sWriteString) {
		this.sWriteString = sWriteString;
	}

	// Devuelve SwriteInt
	 */
	public SWriteInt getsWriteInt() {
		return sWriteInt;
	}

	// Modifica swriteInt
	public void setsWriteInt(SWriteInt sWriteInt) {
		this.sWriteInt = sWriteInt;
	}

	// Devuelve sWriteLn
	public SWriteLn getsWriteLn() {
		return sWriteLn;
	}

	// Modifica sWriteLn
	public void setsWriteLn(SWriteLn sWriteLn) {
		this.sWriteLn = sWriteLn;
	}	
}
