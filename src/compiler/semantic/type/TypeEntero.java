package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

public class TypeEntero extends TypeBase {

	public TypeEntero(ScopeIF scope) {
		super(scope, "ENTERO");
	}
}
