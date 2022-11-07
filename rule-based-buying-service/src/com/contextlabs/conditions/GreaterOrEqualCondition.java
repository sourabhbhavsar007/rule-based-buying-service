package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class GreaterOrEqualCondition extends Condition{
	
	public GreaterOrEqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) >= 0;
	}

	
}
