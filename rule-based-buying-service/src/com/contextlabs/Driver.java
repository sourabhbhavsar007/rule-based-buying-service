package com.contextlabs;

import com.contextlabs.attributes.NumericAttribute;
import com.contextlabs.attributes.StringAttribute;
import com.contextlabs.conditions.EqualCondition;
import com.contextlabs.conditions.GreaterThanCondition;
import com.contextlabs.conditions.LessThanCondition;
import com.contextlabs.product.Product;
import com.contextlabs.rule.Rule;
import com.contextlabs.rule.RuleSet;

public class Driver {

	public static void main(String[] args) {

		//We make buying decision if this threshold is crossed.
		final double BUYING_THRESHOLD = (double) 0.5;

		RuleSet ruleSet = new RuleSet("Buying Rules",
				new Rule(100, 
						new EqualCondition(new StringAttribute("color", "")),
						new LessThanCondition(new NumericAttribute("price", 60.00)),
						new GreaterThanCondition(new NumericAttribute("quantity", 700))
				)
		);
		
		Product[] products  = new Product[]{
				new Product("Puma Shoes PS-1",
						new StringAttribute("color","blue"),
						new NumericAttribute("price",76.87),
						new NumericAttribute("quantity", 400)
				),
				new Product("Adidas Green Magic",
						new StringAttribute("color","green"),
						new NumericAttribute("price",54.15),
						new NumericAttribute("quantity", 800)
				),
				new Product("Nike Red Devil",
						new StringAttribute("color","red"),
						new NumericAttribute("price",82.17),
						new NumericAttribute("quantity", 600)
				),
				
		};

		String productName = null;
		double sumOfPrices = 0.0;
		int numberOfPrices = 0;

		for (Product product : products) {
			float scoreValue = ruleSet.scoreValue(product);
			
			if (scoreValue >= BUYING_THRESHOLD) {
				productName = product.getName();
				sumOfPrices += product.getPrice();
				numberOfPrices++;
				
			}	
		}
		double averagePrice = sumOfPrices / (double) numberOfPrices;

		//Checking edge case where no conditions fulfill
		if(null == productName || sumOfPrices == 0.0){
			System.out.println("No buying decision can be taken based on given conditions.");
			return;
		}

		System.out.println("**************** Buying Decisions ****************");
		System.out.println("Product Name : " + productName);
		System.out.println("Total price : " + sumOfPrices);
		System.out.println("Average price : " + averagePrice);
		System.out.println("**************************************************");
		
	}

}
