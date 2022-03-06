package com.acorn.cherryM.openChatDto;

public class openChatDto {
	private String mid;
	private long ocregdate;
	private String occomment;
	
	public openChatDto() {}

	public openChatDto(String mid, int ocregdate, String occomment) {
		super();
		this.mid = mid;
		this.ocregdate = ocregdate;
		this.occomment = occomment;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public long getOcregdate() {
		return ocregdate;
	}

	public void setOcregdate(long ocregdate) {
		this.ocregdate = ocregdate;
	}

	public String getOccomment() {
		return occomment;
	}

	public void setOccomment(String occomment) {
		this.occomment = occomment;
	};
	
	
}
