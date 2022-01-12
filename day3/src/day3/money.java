package day3;

import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("금액을 입력하시오>>");
		int m=sc.nextInt();
		
		int a,b,c,d,e,f,g;
		
			a=m/50000;
			m=m-(a*50000);
			
			b=m/10000;
			m=m-(b*10000);
			
			c=m/1000;
			m=m-(c*1000);
			
			d=m/100;
			m=m-(a*100);
			
			e=m/50;
			m=m-(e*50);
			
			f=m/10;
			m=m-(f*10);
			
			g=m;
			
			
			System.out.println("오만원권 "+ a+"매");
			System.out.println("만원권 "+ b+"매");
			System.out.println("천원권 "+ c+"매");
			System.out.println("백원 "+ d+"매");
			System.out.println("오십원 "+e+"매");
			System.out.println("십원 "+ f+"매");
			System.out.println("일원 "+ g+"매");
			
			
			
		
		
	}

}
