package day3;

import java.util.Scanner;

public class wjdtn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("2�ڸ� ���� �Է�(10~99)>>");
		int j=sc.nextInt();
		
		if (j%11==0)
			System.out.println("����");
		else
			System.out.println("�ƴ�");
		
		
	}

}
