package org.kavi;
import java.util.Scanner;
public class Z {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("valu:");
		int n=s.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("valu1:"+(i+1)+":");
			int a=s.nextInt();
			System.out.println("valu2:"+(i+1)+";");
			int b=s.nextInt();
			System.out.println("a="+a+ "b="+b+ ":");
			System.out.println(a*b);
		
		}
	}

}
