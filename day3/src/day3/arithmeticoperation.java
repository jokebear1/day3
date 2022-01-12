package day3;

import java.util.Scanner;

public class arithmeticoperation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("A: ");
		int num1=scanner.nextInt();
		System.out.print("B: ");
		int num2=scanner.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
	}

}
