package day3;

import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
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
			
			
			System.out.println("�������� "+ a+"��");
			System.out.println("������ "+ b+"��");
			System.out.println("õ���� "+ c+"��");
			System.out.println("��� "+ d+"��");
			System.out.println("���ʿ� "+e+"��");
			System.out.println("�ʿ� "+ f+"��");
			System.out.println("�Ͽ� "+ g+"��");
			
			
			
		
		
	}

}
