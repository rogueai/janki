package com.rogueai.janki.core.persistence.json;

import java.math.BigDecimal;

/**
 * 
 * @author matsuleode
 * 
 */
public class Rev {

	private int perDay;

	private BigDecimal ivlFct;

	private int maxIvl;

	private int minSpace;

	private BigDecimal ease4;

	private BigDecimal fuzz;

	public int getPerDay() {
		return perDay;
	}

	public void setPerDay(int perDay) {
		this.perDay = perDay;
	}

	public BigDecimal getIvlFct() {
		return ivlFct;
	}

	public void setIvlFct(BigDecimal ivlFct) {
		this.ivlFct = ivlFct;
	}

	public int getMaxIvl() {
		return maxIvl;
	}

	public void setMaxIvl(int maxIvl) {
		this.maxIvl = maxIvl;
	}

	public int getMinSpace() {
		return minSpace;
	}

	public void setMinSpace(int minSpace) {
		this.minSpace = minSpace;
	}

	public BigDecimal getEase4() {
		return ease4;
	}

	public void setEase4(BigDecimal ease4) {
		this.ease4 = ease4;
	}

	public BigDecimal getFuzz() {
		return fuzz;
	}

	public void setFuzz(BigDecimal fuzz) {
		this.fuzz = fuzz;
	}

}