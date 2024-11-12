package org.day10;

public class Vechile extends Project1{
	private String modelName="aa";
	public static void main(String[] args) {
		Vechile myVechile=new Vechile();
		myVechile.honk();
		System.out.println(myVechile.brand+" "+myVechile.modelName);
	}

}
