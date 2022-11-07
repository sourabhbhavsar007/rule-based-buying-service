package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class LessOrEqualCondition extends Condition{
	
	public LessOrEqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) == 0;
	}

	
}
