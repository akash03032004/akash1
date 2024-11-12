package org.day11;
import java.util.Scanner;
public class Project2 {
	public static void main(String[] args) {
		Scanner not=new Scanner(System.in);
		System.out.println("salery");
		int money=not.nextInt();
		System.out.println("commission");
		double money1=not.nextDouble();
		
		
		if(money>=50000&money1>500) {
			System.out.println("commission;  "+money*0.27);
			System.out.println("commission1;  "+money1*6);
			}
			else if(money<=30000) { 
			System.out.println("commision:"+money*0.20);
				}
			else if(money1==500) {
				System.out.println("bones:"+money1*2);
			}
			else {
				System.out.println("is not correct");
			}
		
		
	}

}
