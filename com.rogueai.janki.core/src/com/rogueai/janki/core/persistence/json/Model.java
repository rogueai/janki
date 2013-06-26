package com.rogueai.janki.core.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an Anki Model. Note that this is not the exact equivalent of
 * "Models" [models.py] in Anki, since JAnki maintains a one-to-many
 * relationship between a {@link Collection} and its models
 * 
 * <pre>
 * defaultModel = {
 *     'sortf': 0,
 *     'did': 1,
 *     'latexPre': """\
 * \\documentclass[12pt]{article}
 * \\special{papersize=3in,5in}
 * \\usepackage{amssymb,amsmath}
 * \\pagestyle{empty}
 * \\setlength{\\parindent}{0in}
 * \\begin{document}
 * """,
 *     'latexPost': "\\end{document}",
 *     'mod': 0,
 *     'usn': 0,
 *     'vers': [], # FIXME: remove when other clients have caught up
 *     'type': MODEL_STD,
 *     'css': """\
 * .card {
 *  font-family: arial;
 *  font-size: 20px;
 *  text-align: center;
 *  color: black;
 *  background-color: white;
 * }
 * """
 * }
 * </pre>
 * 
 * @author matsuleode
 * 
 */
public class Model {

	public static final Model DEFAULT_MODEL;
	static {
		DEFAULT_MODEL = new Model();
		DEFAULT_MODEL.sortf = 0;
		DEFAULT_MODEL.did = 1;
		DEFAULT_MODEL.latexPre = "\\\\documentclass[12pt]{article} "
				+ "\\\\special{papersize=3in,5in} "
				+ "\\\\usepackage[utf8]{inputenc} "
				+ "\\\\usepackage{amssymb,amsmath} "
				+ "\\\\pagestyle{empty} "
				+ "\\\\setlength{\\\\parindent}{0in} "
				+ "\\\\begin{document} ";
		DEFAULT_MODEL.latexPost = "\\\\end{document}";
		DEFAULT_MODEL.type = Model.MODEL_STD;
		DEFAULT_MODEL.css = ".card {"
				+ "font-family: arial;"
				+ "font-size: 20px;"
				+ "text-align: center;"
				+ "color: black;"
				+ "background-color: white;}";

		DEFAULT_MODEL.flds.add(Field.DEFAULT_FIELD);
		DEFAULT_MODEL.tmpls.add(Template.DEFAULT_TEMPLATE);
	}

	public static final int MODEL_STD = 0;

	public static final int MODEL_CLOZE = 1;

	// END-STATIC

	/*
	 * @deprecated do not use, maintained for backwards compatibility with older
	 * clients
	 */
	@Deprecated
	@JsonProperty("vers")
	private int[] vers = new int[0];

	@JsonProperty("id")
	private long id = 0;

	@JsonProperty("name")
	private String name;

	@JsonProperty("sortf")
	private int sortf;

	@JsonProperty("did")
	private long did;

	@JsonProperty("latexPre")
	private String latexPre;

	@JsonProperty("latexPost")
	private String latexPost;

	@JsonProperty("mod")
	private int mod;

	@JsonProperty("usn")
	private int usn;

	@JsonProperty("type")
	private int type;

	@JsonProperty("css")
	private String css;

	@JsonProperty("flds")
	private List<Field> flds = new ArrayList<Field>();

	@JsonProperty("tmpls")
	private List<Template> tmpls = new ArrayList<Template>();

	@JsonProperty("tags")
	private List<String> tags = new ArrayList<String>();

	@JsonProperty("req")
	private List<Req> reqs = new ArrayList<Req>();

	public int[] getVers() {
		return vers;
	}

	public void setVers(int[] vers) {
		this.vers = vers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortf() {
		return sortf;
	}

	public void setSortf(int sortf) {
		this.sortf = sortf;
	}

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public String getLatexPre() {
		return latexPre;
	}

	public void setLatexPre(String latexPre) {
		this.latexPre = latexPre;
	}

	public String getLatexPost() {
		return latexPost;
	}

	public void setLatexPost(String latexPost) {
		this.latexPost = latexPost;
	}

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public List<Field> getFlds() {
		return flds;
	}

	public void setFlds(List<Field> flds) {
		this.flds = flds;
	}

	public List<Template> getTmpls() {
		return tmpls;
	}

	public void setTmpls(List<Template> tmpls) {
		this.tmpls = tmpls;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<Req> getReqs() {
		return reqs;
	}

	public void setReqs(List<Req> reqs) {
		this.reqs = reqs;
	}

}
