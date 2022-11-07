package com.contextlabs.product;

import java.util.HashMap;
import java.util.Map;

import com.contextlabs.attributes.AttributeValue;
import com.contextlabs.attributes.NumericAttribute;

public class Product {
	String name;
	Map<String, AttributeValue> attributes = new HashMap<>();
	
	public Product(String name, AttributeValue... attributes) {
		super();
		this.name = name;
		for (AttributeValue attribute : attributes) {
			this.attributes.put(attribute.getName(), attribute);
		}
	}

	public String getName() { return name; }

	public AttributeValue getAttributeValue(String name) {
		return attributes.get(name);
	}

	public double getPrice() {
		return ((NumericAttribute)getAttributeValue("price")).getCoreValue();
	}
}
