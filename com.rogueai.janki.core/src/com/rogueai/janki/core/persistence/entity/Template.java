package com.rogueai.janki.core.persistence.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <pre>
 * defaultTemplate = {
 *     'name': "",
 *     'ord': None,
 *     'qfmt': "",
 *     'afmt': "",
 *     'did': None,
 *     'bqfmt': "",
 *     'bafmt': "",
 *     # we don't define these so that we pick up system font size until set
 *     #'bfont': "Arial",
 *     #'bsize': 12,
 * }
 * </pre>
 * 
 * 
 * @author matsuleode
 */
public class Template {

	public static final Template DEFAULT_TEMPLATE;
	static {
		DEFAULT_TEMPLATE = new Template();
		DEFAULT_TEMPLATE.name = "";
		DEFAULT_TEMPLATE.ord = null;
		DEFAULT_TEMPLATE.qfmt = "";
		DEFAULT_TEMPLATE.afmt = "";
		DEFAULT_TEMPLATE.did = 0;
		DEFAULT_TEMPLATE.bqfmt = "";
		DEFAULT_TEMPLATE.bafmt = "";
	}

	@JsonProperty("name")
	private String name;

	@JsonProperty("ord")
	private Integer ord;

	@JsonProperty("qfmt")
	private String qfmt;

	@JsonProperty("afmt")
	private String afmt;

	@JsonProperty("did")
	private long did;

	@JsonProperty("bqfmt")
	private String bqfmt;

	@JsonProperty("bafmt")
	private String bafmt;

	// we don't define these so that we pick up system font size until set
	// @JsonProperty("bfont")
	// private String bfont;
	// @JsonProperty("bsize")
	// private int bsize;

	public String getQfmt() {
		return qfmt;
	}

	public void setQfmt(String qfmt) {
		this.qfmt = qfmt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public String getAfmt() {
		return afmt;
	}

	public void setAfmt(String afmt) {
		this.afmt = afmt;
	}

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public String getBqfmt() {
		return bqfmt;
	}

	public void setBqfmt(String bqfmt) {
		this.bqfmt = bqfmt;
	}

	public String getBafmt() {
		return bafmt;
	}

	public void setBafmt(String bafmt) {
		this.bafmt = bafmt;
	}

}
