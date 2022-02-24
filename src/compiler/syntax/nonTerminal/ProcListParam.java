package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class ProcListParam extends NonTerminal {

	private List<ProcParam> procParamList;
	
	// Constructor ProcListParam vacío
	public ProcListParam() {
		super();
		this.procParamList = new ArrayList<ProcParam>();
	}
	
	// Constructor ProcListParam pasándole ProcParam
	public ProcListParam(ProcParam procParam) {
		super();
		this.procParamList = new ArrayList<ProcParam>();
		this.procParamList.add(procParam);
	}

	// Devuelve procListParam
	public List<ProcParam> getProcParamList() {
		return procParamList;
	}

	// Modifica ProcListParam
	public void setProcParam(List<ProcParam> procParamList) {
		this.procParamList = procParamList;
	}
	
	// Añade ProcParam a procParamList
	public void addProcParam(ProcParam procParam) {
		this.procParamList.add(procParam);
	}
}