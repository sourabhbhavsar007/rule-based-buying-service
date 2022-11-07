package com.contextlabs.attributes;

public class NumericAttribute extends AttributeValue{
	Number value;
	public NumericAttribute(String name, Number value) {
		super(name);
		this.value = value;
	}

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				Number otherNumericValue = ((NumericAttribute)o).value;

				return (int)(Math.signum(value.floatValue() - otherNumericValue.floatValue()));
			}};
	}
	public double getCoreValue() {
		return value.doubleValue();
	}

}
