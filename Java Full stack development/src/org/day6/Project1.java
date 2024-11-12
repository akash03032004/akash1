package org.day6;

public class Project1 {
	private String name;
	private String aadharNo;
	private String address;
	private long phone;
	public Project1() {
		System.out.println("value");
	}
	public Project1(String name,String aadharNo,String adress,long phone) {
		this.name=name;
		this.aadharNo=aadharNo;
		this.address=address;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Project1 [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
}