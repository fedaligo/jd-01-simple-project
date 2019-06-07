package by.htp.vetvlenie.main;

import java.util.Scanner;

public class Zadacha07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		sc.close();
		int y=Math.abs(a*x*x+b*x+c);
		System.out.println(y);
	}

}
