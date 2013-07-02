package com.rogueai.janki.core.persistence.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: might be "Deck Conf"
 * 
 * @author matsuleode
 * 
 */
public class Dconf {

	private String name;

	private boolean replayq;

	private Lapse lapse;

	private Rev rev;

	private int timer;

	private boolean dyn;

	private int maxTaken;

	private int usn;

	@JsonProperty("new")
	private New newc;

	private boolean autoplay;

	private long id;

	private long mod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReplayq() {
		return replayq;
	}

	public void setReplayq(boolean replayq) {
		this.replayq = replayq;
	}

	public Lapse getLapse() {
		return lapse;
	}

	public void setLapse(Lapse lapse) {
		this.lapse = lapse;
	}

	public Rev getRev() {
		return rev;
	}

	public void setRev(Rev rev) {
		this.rev = rev;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public boolean isDyn() {
		return dyn;
	}

	public void setDyn(boolean dyn) {
		this.dyn = dyn;
	}

	public int getMaxTaken() {
		return maxTaken;
	}

	public void setMaxTaken(int maxTaken) {
		this.maxTaken = maxTaken;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public New getNewc() {
		return newc;
	}

	public void setNewc(New newc) {
		this.newc = newc;
	}

	public boolean isAutoplay() {
		return autoplay;
	}

	public void setAutoplay(boolean autoplay) {
		this.autoplay = autoplay;
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
