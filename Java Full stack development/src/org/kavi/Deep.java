package org.kavi;
import java.util.*;
public class Deep {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("vaue:");
		a=s.nextInt();
		b=s.nextInt();
		while(a<=10) {
			System.out.println(a+"*"+b+"="+a*b);
			a++;
		}
	}

}
