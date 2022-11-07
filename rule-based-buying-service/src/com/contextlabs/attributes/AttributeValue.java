package com.contextlabs.attributes;

/**
 * We make this class abstract to inherit common skeleton and functionalities
 * and the only aspect of comparing attributes (types of which is determined at runtime)
 * is delegated to Comparable interface.
 */

public abstract class AttributeValue {
	protected String name;
	
	public AttributeValue(String name) {
		super();
		this.name = name;
	}

	public abstract Comparable<Object> getValue();

	public String getName() {
		return name;
	}	
	
}
