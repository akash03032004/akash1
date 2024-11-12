package com.day8;

public class Student2 implements Program1 {
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student2 [cid=" + cid + ", cname=" + cname + "]";
	}
	@Override
	public void day8() {
		System.out.println("hi akash: "+workuptime);
		// TODO Auto-generated method stub
		
	}
	

}
