package day3;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int num=sc.nextInt();
		int cnt=0;
		
		
		if(num%10==3 || num%10==6 || num%10==9)
			cnt++;
		if(num%10==3 ||num%10==6 ||num%10==9)
			cnt++;
		if(cnt==0)
			System.out.print(num);
		else {
			System.out.println("¹Ú¼ö");
			if(cnt==1)
				System.out.print("Â¦");
			else
				System.out.println("Â¦Â¦");
			
		}
		
			
			
		
	}

}
