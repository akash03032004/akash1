package org.day9;
import java.util.Scanner;
public class Akash {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("value: ");
		int b=a.nextInt();
		for(int i = 1;i<=b;i++)
		{	
			System.out.print(i+"");
			}
		System.out.println();
		for(int i=2;i<b;i++)	
			{	
		System.out.print("");
			for(int j=2;j<b;j++) {
				System.out.print("");
				
			}
			
			System.out.print(b-i+1);
			System.out.println();
	
		}
		for (int i=b;i>=1;i--) {
			System.out.print(i+"");
		}
		System.out.println();
		a.close();
	}
}
