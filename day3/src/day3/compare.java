package day3;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("");
		int a=scanner.nextInt();
		System.out.print("");
		int b=scanner.nextInt();
		
		if (a>b) {
			System.out.println(">");
		}else if (a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		
		}
	}

}
