package day3;

import java.util.Scanner;

public class middle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		
		System.out.print("���� 3�� �Է�>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	if((a>b && b>c) || (a<b && b<c)) {
		System.out.println("�߰� ����"+b);
	}
	else if((b>a && a>c) || (b<a && a<c)) {
		System.out.println("�߰� ����"+a);
	}
	else {
		System.out.println("�߰� ����"+c);
	}
	
		
				
				
	}

}
