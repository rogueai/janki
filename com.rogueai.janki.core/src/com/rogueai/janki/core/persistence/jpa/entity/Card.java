package com.rogueai.janki.core.persistence.jpa.entity;

// Generated 25-feb-2013 6.55.40 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cards generated by hbm2java
 */
@Entity
@Table(name = "cards")
public class Card implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8741419759477988372L;

	private Integer id;
	private int nid;
	private int did;
	private int ord;
	private int mod;
	private int usn;
	private int type;
	private int queue;
	private int due;
	private int ivl;
	private int factor;
	private int reps;
	private int lapses;
	private int left;
	private int odue;
	private int odid;
	private int flags;
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

	@Id
	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nid", nullable = false)
	public int getNid() {
		return this.nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	@Column(name = "did", nullable = false)
	public int getDid() {
		return this.did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Column(name = "ord", nullable = false)
	public int getOrd() {
		return this.ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	@Column(name = "mod", nullable = false)
	public int getMod() {
		return this.mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	@Column(name = "usn", nullable = false)
	public int getUsn() {
		return this.usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "queue", nullable = false)
	public int getQueue() {
		return this.queue;
	}

	public void setQueue(int queue) {
		this.queue = queue;
	}

	@Column(name = "due", nullable = false)
	public int getDue() {
		return this.due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	@Column(name = "ivl", nullable = false)
	public int getIvl() {
		return this.ivl;
	}

	public void setIvl(int ivl) {
		this.ivl = ivl;
	}

	@Column(name = "factor", nullable = false)
	public int getFactor() {
		return this.factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}

	@Column(name = "reps", nullable = false)
	public int getReps() {
		return this.reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	@Column(name = "lapses", nullable = false)
	public int getLapses() {
		return this.lapses;
	}

	public void setLapses(int lapses) {
		this.lapses = lapses;
	}

	@Column(name = "left", nullable = false)
	public int getLeft() {
		return this.left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	@Column(name = "odue", nullable = false)
	public int getOdue() {
		return this.odue;
	}

	public void setOdue(int odue) {
		this.odue = odue;
	}

	@Column(name = "odid", nullable = false)
	public int getOdid() {
		return this.odid;
	}

	public void setOdid(int odid) {
		this.odid = odid;
	}

	@Column(name = "flags", nullable = false)
	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	@Column(name = "data", nullable = false, length = 2000000000)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
