package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class StmSubprogram extends NonTerminal {
	
private List<CabProcedure> procedureList;
	
	// Constructor StmSubprogram vacío
	public StmSubprogram() {
		super();
		procedureList = new ArrayList<CabProcedure>();
	}
	
	// Devuelve procedureList
	public List<CabProcedure> getProcedureList() {
		return this.procedureList;
	}
	
	// Añade Cuerpo a un CabProcedure y CabProcedure a procedureList
	public void addCuerpoProcedure(CabProcedure cabProcedure, Cuerpo cuerpo) {
		cabProcedure.addCuerpo(cuerpo);
		procedureList.add(cabProcedure);
	}
}
