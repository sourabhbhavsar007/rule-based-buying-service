package com.contextlabs.attributes;

public class StringAttribute extends AttributeValue {
	String value;
	public StringAttribute(String name, String value) {
		super(name);
		this.value = value;
	}

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				String otherStringValue = ((StringAttribute)o).value;
				return value.compareTo(otherStringValue);
			}};
	}

}
