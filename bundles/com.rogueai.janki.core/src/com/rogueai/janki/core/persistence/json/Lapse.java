package com.rogueai.janki.core.persistence.json;

import java.math.BigDecimal;

/**
 * 
 * @author matsuleode
 * 
 */
public class Lapse {

	private int leechFails;

	private int minInt;

	private int[] delays;

	private int leechAction;

	private BigDecimal mult;

	public int getLeechFails() {
		return leechFails;
	}

	public void setLeechFails(int leechFails) {
		this.leechFails = leechFails;
	}

	public int getMinInt() {
		return minInt;
	}

	public void setMinInt(int minInt) {
		this.minInt = minInt;
	}

	public int[] getDelays() {
		return delays;
	}

	public void setDelays(int[] delays) {
		this.delays = delays;
	}

	public int getLeechAction() {
		return leechAction;
	}

	public void setLeechAction(int leechAction) {
		this.leechAction = leechAction;
	}

	public BigDecimal getMult() {
		return mult;
	}

	public void setMult(BigDecimal mult) {
		this.mult = mult;
	}

}