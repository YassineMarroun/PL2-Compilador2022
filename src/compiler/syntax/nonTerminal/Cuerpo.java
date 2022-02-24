package compiler.syntax.nonTerminal;

public class Cuerpo extends NonTerminal {

	private StmConstantes stmConstantes;
	private StmTipos stmTipos;
	private StmVar stmVar;
	private StmSubprogram stmSubprogram;
	private Sentencias sentencias;
	
	// Constructor Cuerpo pasándole StmConstantes, StmTipos, StmVar, StmSubprogram y Sentencias
	public Cuerpo(StmConstantes stmConstantes, StmTipos stmTipos, StmVar stmVar, StmSubprogram stmSubprogram,
			Sentencias sentencias) {
		super();
		this.stmConstantes = stmConstantes;
		this.stmTipos = stmTipos;
		this.stmVar = stmVar;
		this.stmSubprogram = stmSubprogram;
		this.sentencias = sentencias;
	}
	
	// Devuelve stmConstantes
	public StmConstantes getStmConstantes() {
		return stmConstantes;
	}
	
	// Modifica stmConstantes
	public void setStmConstantes(StmConstantes stmConstantes) {
		this.stmConstantes = stmConstantes;
	}
	
	// Devuelve stmTipos
	public StmTipos getStmTipos() {
		return stmTipos;
	}
	
	// Modifica stmTipos
	public void setStmTipos(StmTipos stmTipos) {
		this.stmTipos = stmTipos;
	}
	
	// Devuelve StmVar
	public StmVar getStmVar() {
		return stmVar;
	}
	
	// Modifica stmVar
	public void setStmVar(StmVar stmVar) {
		this.stmVar = stmVar;
	}
	
	// Devuelve stmSubprogram
	public StmSubprogram getStmSubprogram() {
		return stmSubprogram;
	}
	
	// Modifica stmSubprogram
	public void setStmSubprogram(StmSubprogram stmSubprogram) {
		this.stmSubprogram = stmSubprogram;
	}
	
	/*
	 * Devuelve Sentencias
	 */
	public Sentencias getSentencias() {
		return sentencias;
	}
	
	/*
	 * Modifica sentencias
	 */
	public void setSentencias(Sentencias sentencias) {
		this.sentencias = sentencias;
	}	
}
