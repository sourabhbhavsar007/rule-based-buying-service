package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class GreaterThanCondition extends Condition{
	
	public GreaterThanCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) > 0;
	}

	
}
