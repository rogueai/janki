package com.rogueai.janki.core.persistence.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <pre>
 * defaultField = {
 *     'name': "",
 *     'ord': None,
 *     'sticky': False,
 *     # the following alter editing, and are used as defaults for the
 *     # template wizard
 *     'rtl': False,
 *     'font': "Arial",
 *     'size': 20,
 *     # reserved for future use
 *     'media': [],
 * }
 * </pre>
 * 
 * @author matsuleode
 */
public class Field {

	public static final Field DEFAULT_FIELD;
	static {
		DEFAULT_FIELD = new Field();
		DEFAULT_FIELD.name = "";
		DEFAULT_FIELD.ord = null;
		DEFAULT_FIELD.sticky = false;
		DEFAULT_FIELD.rtl = false;
		DEFAULT_FIELD.font = "Arial";
		DEFAULT_FIELD.size = 20;
	}

	@JsonProperty("name")
	private String name;

	@JsonProperty("ord")
	private Integer ord;

	@JsonProperty("sticky")
	private boolean sticky;

	// the following alter editing, and are used as defaults for the template
	// wizard
	@JsonProperty("rtl")
	private boolean rtl;

	@JsonProperty("font")
	private String font;

	@JsonProperty("size")
	private int size;

	// reserved for future use
	@JsonProperty("media")
	private List<String> media = new ArrayList<String>();

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

	public boolean isSticky() {
		return sticky;
	}

	public void setSticky(boolean sticky) {
		this.sticky = sticky;
	}

	public boolean isRtl() {
		return rtl;
	}

	public void setRtl(boolean rtl) {
		this.rtl = rtl;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<String> getMedia() {
		return media;
	}

	public void setMedia(List<String> media) {
		this.media = media;
	}

}
