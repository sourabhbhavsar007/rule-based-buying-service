package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public abstract class Condition {
	protected AttributeValue attributeValue;
	
	public Condition(AttributeValue attributeValue) {
		super();
		this.attributeValue = attributeValue;
	}

	public abstract boolean isFulfilled(AttributeValue otherAttributeValue);

	public AttributeValue getAttributeValue() {
		return attributeValue;
	}

}
