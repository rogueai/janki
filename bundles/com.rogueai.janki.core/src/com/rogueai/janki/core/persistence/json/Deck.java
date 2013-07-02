package com.rogueai.janki.core.persistence.json;

/**
 * 
 * @author matsuleode
 * 
 */
public class Deck {

	private String desc;

	private String name;

	private int extendRev;

	private int usn;

	private boolean collapsed;

	private long mid;

	private int[] newToday;

	private int[] timeToday;

	private int dyn;

	private int extendNew;

	private long conf;

	private int[] revToday;

	private int[] lrnToday;

	private long id;

	private long mod;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExtendRev() {
		return extendRev;
	}

	public void setExtendRev(int extendRev) {
		this.extendRev = extendRev;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	public void setCollapsed(boolean collapsed) {
		this.collapsed = collapsed;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
	}

	public int[] getNewToday() {
		return newToday;
	}

	public void setNewToday(int[] newToday) {
		this.newToday = newToday;
	}

	public int[] getTimeToday() {
		return timeToday;
	}

	public void setTimeToday(int[] timeToday) {
		this.timeToday = timeToday;
	}

	public int getDyn() {
		return dyn;
	}

	public void setDyn(int dyn) {
		this.dyn = dyn;
	}

	public int getExtendNew() {
		return extendNew;
	}

	public void setExtendNew(int extendNew) {
		this.extendNew = extendNew;
	}

	public long getConf() {
		return conf;
	}

	public void setConf(long conf) {
		this.conf = conf;
	}

	public int[] getRevToday() {
		return revToday;
	}

	public void setRevToday(int[] revToday) {
		this.revToday = revToday;
	}

	public int[] getLrnToday() {
		return lrnToday;
	}

	public void setLrnToday(int[] lrnToday) {
		this.lrnToday = lrnToday;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMod() {
		return mod;
	}

	public void setMod(long mod) {
		this.mod = mod;
	}

}
