package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.ScopeIF;

public class CabProcedure extends NonTerminal {

	private String identificador;
	private ProcParenParam procParenParam;
	private TipoRetorno tipoRetorno;
	private ScopeIF scope;
	private Cuerpo cuerpo;
	
	//Constructor CabProcedure pasándole String, ProcParenParam, TipoRetorno y ScopeIF
	public CabProcedure(String identificador, ProcParenParam procParenParam, TipoRetorno tipoRetorno, ScopeIF scope) {
		super();
		this.identificador = identificador;
		this.procParenParam = procParenParam;
		this.tipoRetorno = tipoRetorno;
		this.scope = scope;
	}

	// Devuelve identificador
	public String getIdentificador() {
		return identificador;
	}

	// Modifica identificador
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	// Devuelve procParenParam
	public ProcParenParam getProcParenParam() {
		return procParenParam;
	}

	// Modifica procParenParam
	public void setProcParenParam(ProcParenParam procParemParam) {
		this.procParenParam = procParemParam;
	}

	//Devuelve tipoRetorno
	public TipoRetorno getTipoRetorno() {
		return tipoRetorno;
	}

	// Modifica tipoRetorno
	public void setTipoRetorno(TipoRetorno tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	// Devuelve scope
	public ScopeIF getScope() {
		return scope;
	}

	// Modifica scope
	public void setScope(ScopeIF scope) {
		this.scope = scope;
	}

	// Devuelve cuerpo
	public Cuerpo getCuerpo() {
		return cuerpo;
	}

	// Modifica cuerpo
	public void setCuerpo(Cuerpo cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	// Añade el cuerpo al CabProcedure
	public void addCuerpo(Cuerpo cuerpo) {
		this.cuerpo = cuerpo;
	}	
}
