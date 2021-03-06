package com.sam.entity;

/**
 * Assettype entity. @author MyEclipse Persistence Tools
 */

public class AssetType implements java.io.Serializable {

	// Fields

	private Integer atid;
	private String atname;
	private Integer atlevel;

	// Constructors

	/** default constructor */
	public AssetType() {
	}

	/** minimal constructor */
	public AssetType(Integer atid) {
		this.atid = atid;
	}

	/** full constructor */
	public AssetType(Integer atid, String atname, Integer atlevel) {
		this.atid = atid;
		this.atname = atname;
		this.atlevel = atlevel;
	}

	// Property accessors

	public Integer getAtid() {
		return this.atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public String getAtname() {
		return this.atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public Integer getAtlevel() {
		return this.atlevel;
	}

	public void setAtlevel(Integer atlevel) {
		this.atlevel = atlevel;
	}

}