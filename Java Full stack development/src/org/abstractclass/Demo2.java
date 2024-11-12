package org.abstractclass;

public class Demo2 {
	
	public static void main(String[] args) {
		Square ab=new Square();
		Rectangle abc= new Rectangle();
		abc.Area();
		abc.show();
		ab.Area();
		ab.show();
		
		
		System.out.println("------------------------");
		Abstrct Abstrct;
		Abstrct=new Square(12.5f);
		
		Abstrct.Area();
		Abstrct.show();
		Abstrct=new Rectangle(10,20);
		Abstrct.Area();
		Abstrct.show();
	}


}
