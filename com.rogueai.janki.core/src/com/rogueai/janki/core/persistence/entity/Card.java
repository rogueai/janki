package com.rogueai.janki.core.persistence.entity;

// Generated 25-feb-2013 6.55.40 by Hibernate Tools 3.4.0.CR1

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.rogueai.janki.core.persistence.dao.impl.CardDao;

/**
 * Cards generated by hbm2java
 */
@DatabaseTable(tableName = "cards", daoClass = CardDao.class)
public class Card implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@DatabaseField(columnName = "id", id = true)
	private Integer id;
	@DatabaseField(columnName = "nid", canBeNull = false)
	private int nid;
	@DatabaseField(columnName = "did", canBeNull = false)
	private int did;
	@DatabaseField(columnName = "ord", canBeNull = false)
	private int ord;
	@DatabaseField(columnName = "mod", canBeNull = false)
	private int mod;
	@DatabaseField(columnName = "usn", canBeNull = false)
	private int usn;
	@DatabaseField(columnName = "type", canBeNull = false)
	private int type;
	@DatabaseField(columnName = "queue", canBeNull = false)
	private int queue;
	@DatabaseField(columnName = "due", canBeNull = false)
	private int due;
	@DatabaseField(columnName = "ivl", canBeNull = false)
	private int ivl;
	@DatabaseField(columnName = "factor", canBeNull = false)
	private int factor;
	@DatabaseField(columnName = "reps", canBeNull = false)
	private int reps;
	@DatabaseField(columnName = "lapses", canBeNull = false)
	private int lapses;
	@DatabaseField(columnName = "left", canBeNull = false)
	private int left;
	@DatabaseField(columnName = "odue", canBeNull = false)
	private int odue;
	@DatabaseField(columnName = "odid", canBeNull = false)
	private int odid;
	@DatabaseField(columnName = "flags", canBeNull = false)
	private int flags;
	@DatabaseField(columnName = "data", canBeNull = false, width = 2000000000)
	private String data;

	public Card() {
	}

	public Card(Integer id, int nid, int did, int ord, int mod, int usn, int type, int queue, int due, int ivl, int factor, int reps, int lapses,
			int left, int odue, int odid, int flags, String data) {
		this.id = id;
		this.nid = nid;
		this.did = did;
		this.ord = ord;
		this.mod = mod;
		this.usn = usn;
		this.type = type;
		this.queue = queue;
		this.due = due;
		this.ivl = ivl;
		this.factor = factor;
		this.reps = reps;
		this.lapses = lapses;
		this.left = left;
		this.odue = odue;
		this.odid = odid;
		this.flags = flags;
		this.data = data;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNid() {
		return this.nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public int getDid() {
		return this.did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getOrd() {
		return this.ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public int getMod() {
		return this.mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public int getUsn() {
		return this.usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getQueue() {
		return this.queue;
	}

	public void setQueue(int queue) {
		this.queue = queue;
	}

	public int getDue() {
		return this.due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	public int getIvl() {
		return this.ivl;
	}

	public void setIvl(int ivl) {
		this.ivl = ivl;
	}

	public int getFactor() {
		return this.factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}

	public int getReps() {
		return this.reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getLapses() {
		return this.lapses;
	}

	public void setLapses(int lapses) {
		this.lapses = lapses;
	}

	public int getLeft() {
		return this.left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getOdue() {
		return this.odue;
	}

	public void setOdue(int odue) {
		this.odue = odue;
	}

	public int getOdid() {
		return this.odid;
	}

	public void setOdid(int odid) {
		this.odid = odid;
	}

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
