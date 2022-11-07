package com.contextlabs.rule;

import com.contextlabs.attributes.AttributeValue;
import com.contextlabs.conditions.Condition;
import com.contextlabs.product.Product;

public class Rule {
	private int score;
	private Condition[] conditions;
	
	public Rule(int score, Condition... conditions) {
		super();
		this.score = score;
		this.conditions = conditions;
	}

	public int getScore() {
		return score;
	}

	public float score(Product product) {

		int conditionsFulfilled = 0;

		for (Condition condition : conditions) {
			AttributeValue conditionValue = condition.getAttributeValue();
			String attributeName = conditionValue.getName();
			AttributeValue productValue = product.getAttributeValue(attributeName);

			if (productValue == null) {
				break;
			}

			if (condition.isFulfilled(productValue)) {
				conditionsFulfilled++;
			}
		}

		return ((float)conditionsFulfilled / (float)conditions.length) * (float)score;
	}
	
}
