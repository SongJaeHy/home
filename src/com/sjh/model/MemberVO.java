package com.sjh.model;

public class MemberVO {
	private String mid;
	private String mpw;
	private String mname;
	private String msepart;
	private int mnumber;
	private int mphone;
	private String memail;

public MemberVO() {
	
}

public MemberVO(String mid, String mpw, String mname, String msepart, int mnumber, int mphone, String memail) {
	super();
	this.mid = mid;
	this.mpw = mpw;
	this.mname = mname;
	this.msepart = msepart;
	this.mnumber = mnumber;
	this.mphone = mphone;
	this.memail = memail;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public String getMpw() {
	return mpw;
}

public void setMpw(String mpw) {
	this.mpw = mpw;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public String getMsepart() {
	return msepart;
}

public void setMsepart(String msepart) {
	this.msepart = msepart;
}

public int getMnumber() {
	return mnumber;
}

public void setMnumber(int mnumber) {
	this.mnumber = mnumber;
}

public int getMphone() {
	return mphone;
}

public void setMphone(int mphone) {
	this.mphone = mphone;
}

public String getMemail() {
	return memail;
}

public void setMemail(String memail) {
	this.memail = memail;
}

@Override
public String toString() {
	return "MemberVO [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", msepart=" + msepart + ", mnumber="
			+ mnumber + ", mphone=" + mphone + ", memail=" + memail + "]";
}
	
}

