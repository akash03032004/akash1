package org.day6;

public class Interface1 extends Project1 {
	private int rollNo;
	private String collegeName;
	public Interface1() {
		super();
	}
	public Interface1(String name,String aadharNo,String address,long phone,int rollNo,String collegeName) {
		super(name,aadharNo,address,phone);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Interface1 [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getAadharNo()=" + getAadharNo()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
	}
	
	
		
	
}
