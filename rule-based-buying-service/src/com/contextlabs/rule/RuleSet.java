package com.contextlabs.rule;

import com.contextlabs.product.Product;

public class RuleSet {
	private String name;
	private Rule[] rules;
	private float maxScore;
	
	public RuleSet(String name, Rule... rules) {
		super();
		this.name = name;
		this.rules = rules;
		
		this.maxScore = 0;
		for (Rule rule : rules) {
			maxScore += (float)(rule.getScore());
		}
	}
	
	public float score(Product product) {
		float result = (float) 0.0;
		for (Rule rule : rules) {
			result += rule.score(product);
		}
		return result;
	}

	public float scoreValue(Product product) {
		return score (product) / maxScore;
	}
	
}
