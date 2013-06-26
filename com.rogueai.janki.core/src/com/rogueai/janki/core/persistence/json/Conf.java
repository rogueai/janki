package com.rogueai.janki.core.persistence.json;

import java.util.List;

/**
 * 
 * @author matsuleode
 * 
 */
public class Conf {

	private long nextPos;

	private boolean estTimes;

	// TODO @matsu: deserialize List<Deck>
	private List<Long> activeDecks;

	private String sortType;

	private long timeLim;

	private boolean sortBackwards;

	private boolean addToCur;

	// TODO @matsu: deserialize Deck
	private long curDeck;

	private long newSpread;

	private List<String> activeCols;

	private boolean dueCounts;

	// TODO @matsu: deserialize Model
	private long curModel;

	private long collapseTime;

	public long getNextPos() {
		return nextPos;
	}

	public void setNextPos(long nextPos) {
		this.nextPos = nextPos;
	}

	public boolean isEstTimes() {
		return estTimes;
	}

	public void setEstTimes(boolean estTimes) {
		this.estTimes = estTimes;
	}

	public List<Long> getActiveDecks() {
		return activeDecks;
	}

	public void setActiveDecks(List<Long> activeDecks) {
		this.activeDecks = activeDecks;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public long getTimeLim() {
		return timeLim;
	}

	public void setTimeLim(long timeLim) {
		this.timeLim = timeLim;
	}

	public boolean isSortBackwards() {
		return sortBackwards;
	}

	public void setSortBackwards(boolean sortBackwards) {
		this.sortBackwards = sortBackwards;
	}

	public boolean isAddToCur() {
		return addToCur;
	}

	public void setAddToCur(boolean addToCur) {
		this.addToCur = addToCur;
	}

	public long getCurDeck() {
		return curDeck;
	}

	public void setCurDeck(long curDeck) {
		this.curDeck = curDeck;
	}

	public long getNewSpread() {
		return newSpread;
	}

	public void setNewSpread(long newSpread) {
		this.newSpread = newSpread;
	}

	public List<String> getActiveCols() {
		return activeCols;
	}

	public void setActiveCols(List<String> activeCols) {
		this.activeCols = activeCols;
	}

	public boolean isDueCounts() {
		return dueCounts;
	}

	public void setDueCounts(boolean dueCounts) {
		this.dueCounts = dueCounts;
	}

	public long getCurModel() {
		return curModel;
	}

	public void setCurModel(long curModel) {
		this.curModel = curModel;
	}

	public long getCollapseTime() {
		return collapseTime;
	}

	public void setCollapseTime(long collapseTime) {
		this.collapseTime = collapseTime;
	}

}
