package com.rogueai.janki.core.persistence.json;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * defaultConf = {
 *     # review options
 *     'activeDecks': [1],
 *     'curDeck': 1,
 *     'newSpread': NEW_CARDS_DISTRIBUTE,
 *     'collapseTime': 1200,
 *     'timeLim': 0,
 *     'estTimes': True,
 *     'dueCounts': True,
 *     # other config
 *     'curModel': None,
 *     'nextPos': 1,
 *     'sortType': "noteFld",
 *     'sortBackwards': False,
 *     'addToCur': True, # add new to currently selected deck?
 * }
 * </pre>
 * 
 * @author matsuleode
 * 
 */
public class Conf {

	public static final Conf DEFAULT_CONF;
	static {
		DEFAULT_CONF = new Conf();
		// review optionsF
		List<Long> activeDecks = new ArrayList<Long>();
		activeDecks.add(1L);
		DEFAULT_CONF.activeDecks = activeDecks;
		DEFAULT_CONF.curDeck = 1;
		DEFAULT_CONF.newSpread = Conf.NEW_CARDS_DISTRIBUTE;
		DEFAULT_CONF.collapseTime = 1200;
		DEFAULT_CONF.timeLim = 0;
		DEFAULT_CONF.estTimes = true;
		DEFAULT_CONF.dueCounts = true;
		// other config
		DEFAULT_CONF.curModel = null;
		DEFAULT_CONF.nextPos = 1;
		DEFAULT_CONF.sortType = "noteFld";
		DEFAULT_CONF.sortBackwards = false;
		DEFAULT_CONF.addToCur = true;
	}

	// whether new cards should be mixed with reviews, or shown first or last
	public static final int NEW_CARDS_DISTRIBUTE = 0;

	public static final int NEW_CARDS_LAST = 1;

	public static final int NEW_CARDS_FIRST = 2;

	// END-STATIC

	private long nextPos;

	private boolean estTimes;

	private List<Long> activeDecks;

	private String sortType;

	private long timeLim;

	private boolean sortBackwards;

	private boolean addToCur;

	private long curDeck;

	private long newSpread;

	private List<String> activeCols;

	private boolean dueCounts;

	private Long curModel;

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

	public Long getCurModel() {
		return curModel;
	}

	public void setCurModel(Long curModel) {
		this.curModel = curModel;
	}

	public long getCollapseTime() {
		return collapseTime;
	}

	public void setCollapseTime(long collapseTime) {
		this.collapseTime = collapseTime;
	}

}
