package by.htp.les02.main;

import java.util.Scanner;

public class Zadacha38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("введите Х ");
		int a=sc.nextInt();
		System.out.println("введите У ");
		int b=sc.nextInt();
		sc.close();
		int x1=0;
		int x2=-3;
		int y1=9;
		int y2=0;
		double z=(y1-y2)*a+(x2-x1)*b+(x1*y2-x2*y1);
		//формула для определения места положения точки, если значение больш нуля, значит входит в область
		if(a>=x1&&a<=x2) {
			if(b>=y1&&b<=y2) {
				if(z>0) {
					System.out.println("true");
				}
				else {System.out.println("false");}
			}
			else {System.out.println("false");
		}
		}
			else {System.out.println("false");}
		

	}

}
