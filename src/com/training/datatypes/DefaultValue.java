package com.training.datatypes;

public class DefaultValue {
	
	
	private int intDemo;
	private float floatDemo;
	private byte byteDemo;
	private short shortDemo;
	private long longDemo;
	private double doubleDemo;
	private char charDemo;
	private boolean booleanDemo;
	
	
	
	public DefaultValue() {
		super();
	}
	public int getIntDemo() {
		return intDemo;
	}
	public void setIntDemo(int intDemo) {
		this.intDemo = intDemo;
	}
	public float getFloatDemo() {
		return floatDemo;
	}
	public void setFloatDemo(float floatDemo) {
		this.floatDemo = floatDemo;
	}
	public byte getByteDemo() {
		return byteDemo;
	}
	public void setByteDemo(byte byteDemo) {
		this.byteDemo = byteDemo;
	}
	public short getShortDemo() {
		return shortDemo;
	}
	public void setShortDemo(short shortDemo) {
		this.shortDemo = shortDemo;
	}
	public long getLongDemo() {
		return longDemo;
	}
	public void setLongDemo(long longDemo) {
		this.longDemo = longDemo;
	}
	public double getDoubleDemo() {
		return doubleDemo;
	}
	public void setDoubleDemo(double doubleDemo) {
		this.doubleDemo = doubleDemo;
	}
	public char getCharDemo() {
		return charDemo;
	}
	public void setCharDemo(char charDemo) {
		this.charDemo = charDemo;
	}
	public boolean isBooleanDemo() {
		return booleanDemo;
	}
	public void setBooleanDemo(boolean booleanDemo) {
		this.booleanDemo = booleanDemo;
	}
	
	@Override
	public String toString() {
		return "DefaultValue [intDemo=" + intDemo + ", floatDemo=" + floatDemo + ", byteDemo=" + byteDemo
				+ ", shortDemo=" + shortDemo + ", longDemo=" + longDemo + ", doubleDemo=" + doubleDemo + ", charDemo="
				+ charDemo + ", booleanDemo=" + booleanDemo + "]";
	}
	
	
	
	
	

}
