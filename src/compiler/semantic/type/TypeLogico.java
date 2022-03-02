package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

public class TypeLogico extends TypeBase {

	public TypeLogico(ScopeIF scope) {
		super(scope, "LOGICO");
	}
}
