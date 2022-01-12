package day3;

import java.util.Scanner;

public class middle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		
		System.out.print("정수 3개 입력>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	if((a>b && b>c) || (a<b && b<c)) {
		System.out.println("중간 값은"+b);
	}
	else if((b>a && a>c) || (b<a && a<c)) {
		System.out.println("중간 값은"+a);
	}
	else {
		System.out.println("중간 값은"+c);
	}
	
		
				
				
	}

}
