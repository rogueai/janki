package com.rogueai.janki.core.persistence.json;

/**
 * 
 * @author matsuleode
 *
 */
public class New {
	
	private boolean separate;
	
	private int[] delays;
	
	private int perDay;
	
	private int[] ints;
	
	private int initialFactor;
	
	private int order;

	public boolean isSeparate() {
		return separate;
	}

	public void setSeparate(boolean separate) {
		this.separate = separate;
	}

	public int[] getDelays() {
		return delays;
	}

	public void setDelays(int[] delays) {
		this.delays = delays;
	}

	public int getPerDay() {
		return perDay;
	}

	public void setPerDay(int perDay) {
		this.perDay = perDay;
	}

	public int[] getInts() {
		return ints;
	}

	public void setInts(int[] ints) {
		this.ints = ints;
	}

	public int getInitialFactor() {
		return initialFactor;
	}

	public void setInitialFactor(int initialFactor) {
		this.initialFactor = initialFactor;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	
}