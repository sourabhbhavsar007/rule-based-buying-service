package com.contextlabs.conditions;

import com.contextlabs.attributes.AttributeValue;

public class EqualCondition extends Condition{

	@Override
	public boolean isFulfilled(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue) == 0;
	}

	public EqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}
}
