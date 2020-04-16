package com.siyaram.microservices.dto;

public class LimitConfigBean {
private int maximum;
private int minimum;

protected LimitConfigBean() {
	
}
public LimitConfigBean(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public int getMinimum() {
	return minimum;
}
//public void setMinimum(int minimum) {
//	this.minimum = minimum;
//}
//public void setMaximum(int maximum) {
//	this.maximum = maximum;
//}

}
