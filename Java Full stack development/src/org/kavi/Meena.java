package org.kavi;
import java.util.Scanner;
public class Meena {
	public static void main(String[] args) {
		Scanner meena= new Scanner(System.in);
		System.out.println("valu:");
		String a=meena.nextLine();
		if(a.equals("mogana"))
		{
			System.out.println("surya meets  ramya,mogana is aead");
		}
			else {
				System.out.println("surya weds meghana,mogana is dead");
		}
		meena.close();
	}

}
