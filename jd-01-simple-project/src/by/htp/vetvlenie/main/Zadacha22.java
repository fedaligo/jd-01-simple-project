package by.htp.vetvlenie.main;

import java.util.Scanner;

public class Zadacha22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("введите х");
		int x=sc.nextInt();
		int x1=x;
	
		System.out.println("введите y");
		int y=sc.nextInt();
		int y1=y;
		sc.close();
		if (x<y) {x=y1;
		y=x1;
		System.out.println("значения изменены");
		System.out.println("x="+x+" y="+y);
		}
		else{System.out.println("значения не изменены");
		System.out.println("x="+x+" y="+y);}
	}

}
