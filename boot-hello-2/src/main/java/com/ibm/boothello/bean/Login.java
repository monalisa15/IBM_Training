package com.ibm.boothello.bean;
public class Login {
	
	private String userid;
	private String passwd;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Login(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}


	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
