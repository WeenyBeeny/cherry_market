package com.acorn.cherryM.member.dto;

public class MemberDto {
	private String id;
	private String pwd;
	private String email;
	private String addr;
	
	public MemberDto() {}

	public MemberDto(String id, String pwd, String email, String addr) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

