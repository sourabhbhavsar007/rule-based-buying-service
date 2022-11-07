package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class LessThanCondition extends Condition{
	
	public LessThanCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) < 0;
	}

	
}
