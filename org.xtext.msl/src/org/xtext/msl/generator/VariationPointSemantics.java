package org.xtext.msl.generator;

public enum VariationPointSemantics {
	AND_SEMANTICS("*-ALL"), OR_SEMANTICS("*-SOME"), XOR_SEMANTICS("*-ONE"), ONE_SEMANTICS("1");

	private final String value;

	VariationPointSemantics(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}