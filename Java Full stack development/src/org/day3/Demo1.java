package org.day3;

public class Demo1 extends Project2 {
	public static void main(String[] args) {
	int m1=100;
	Project2 a1=new Project2();
	Project2 a2=new Project2();
	Project2 a3=new Project2();
	Project2 a4=new Project2();
	Project2 a5=new Project2();
	
	a1.cid=196;
	a1.cname="mani";
	a1.address="villuppuram, 1/2";
	a1.city="villuppuram";
	
	
	a2.cid=100;
	a2.cname="kani";
	a2.address="velur,1/2";
	a2.city="velur";
	
	
	a3.cid=111;
	a3.cname="vaani";
	a3.address="karur,1/4";
	a3.city="";
	
	
	a4.cid=101;
	a4.cname="rani";
	a4.address="ap,2/6";
	a4.city="ap";
	
	
	a5.cid=105;
	a5.cname="kani";
	a5.address="chinnai,3/7";
	a5.city="chinnai";
	
	System.out.println("cid "+a1.cid+"  cname "+a1.cname+"  address "+a1.address+"  city "+a1.city);
	System.out.println("cid "+a2.cid+"  cname "+a2.cname+"  address "+a2.address+"  city "+a2.city);
	System.out.println("cid "+a3.cid+"  cname "+a3.cname+"  address "+a3.address+"  city "+a3.city);
	System.out.println("cid "+a4.cid+"  cname "+a4.cname+"  address "+a4.address+"  city "+a4.city);
	System.out.println("cid "+a5.cid+"  cname "+a5.cname+"  address "+a5.address+"  city "+a5.city);
	}
	
}
