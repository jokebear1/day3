package day3;

import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է�: ");
		int score=sc.nextInt();
		
		if (score<0)
			System.out.println("�ٽ��Է�");
		else if (score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}
