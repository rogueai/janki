package com.rogueai.janki.core.persistence.json;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: @matsu I have absolutely no idea of what's the purpose of this field...
 * As far as I can tell "ord" is the "ord" field in a {@link Template}, the list
 * indicated the required fields... TO BE INVESTIGATED
 * 
 * @author matsuleode
 * 
 */
public class Req {

	private int ord;

	private String type;

	private List<Integer> flds = new ArrayList<Integer>();

	public int getOrd() {
		return ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Integer> getFlds() {
		return flds;
	}

	public void setFlds(List<Integer> flds) {
		this.flds = flds;
	}

}