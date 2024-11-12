package org.assingment;
import java.util.Scanner;
public class Student { 
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String name=a.nextLine();
		String address=a.nextLine();
		int salesAmount=a.nextInt();
		double phone=a.nextDouble();
		double commission=0.0 ;
		
		if(salesAmount>=100000) {
			commission=salesAmount * 0.10;
	}
		else if (salesAmount>=50000&salesAmount<100000) {
			commission=salesAmount * 0.05;
		}
		else if(salesAmount>=30000&salesAmount<50000) {
			commission=salesAmount *0.03;
		
		}
		else {
			commission=0.0;
		}
		
		System.out.println("details");
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("phone number: "+phone);
		System.out.println("Amount: "+salesAmount);
		System.out.println("commission: "+commission);
	}	
}
