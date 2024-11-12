package com.day8;

public class Student1 implements Program1 {
	private int sid;
	private  int sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSname() {
		return sname;
	}
	public void setSname(int sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	}
	@Override
	public void day8() {
		System.out.println("hi karthi: "+workuptime);	
		}

}
