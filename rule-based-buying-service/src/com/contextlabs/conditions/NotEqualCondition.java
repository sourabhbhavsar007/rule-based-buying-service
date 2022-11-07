package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class NotEqualCondition extends Condition{
	
	public NotEqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) != 0;
	}

	
}
