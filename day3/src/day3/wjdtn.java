package day3;

import java.util.Scanner;

public class wjdtn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("2자리 정수 입력(10~99)>>");
		int j=sc.nextInt();
		
		if (j%11==0)
			System.out.println("같음");
		else
			System.out.println("아님");
		
		
	}

}
