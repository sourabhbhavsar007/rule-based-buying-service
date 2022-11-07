package com.contextlabs.attributes;

public class BooleanAttribute extends AttributeValue{
	boolean value;
	
	public BooleanAttribute(String name, boolean value) {
		super(name);
		this.value = value;
	}

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				boolean otherBooleanValue = ((BooleanAttribute)o).value;
				return (value && otherBooleanValue) || (!value && !otherBooleanValue) ? 0 : -1;
			}};
	}
}
