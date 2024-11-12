package org.day3;

public class Eployeedemo  extends Project1{ 
	public static void main(String[] args) {
		int m1=100;
		Project1 e1=new Project1();
		Project1 e2=new Project1();
		Project1 e3=new Project1();
		
		e1.eid=101;
		e1.ename="akash";
		e1.city="villu";
		
		e2.eid=102;
		e2.ename="kari";
		e2.city="vanur";
		
		e3.eid=103;
		e3.ename="kavi";
		e3.city="velur";
		
		System.out.println("eid: "+e2.eid +" ename: "+e2.ename +" city: "+e2.city);
		System.out.println("eid: "+e1.eid +" ename: "+e1.ename +" city: "+e1.city);
		System.out.println("eid: "+e3.eid +" ename: "+e3.ename +" city: "+e3.city);		
	}

}
