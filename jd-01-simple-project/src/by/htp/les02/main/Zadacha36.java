package by.htp.les02.main;

import java.util.Scanner;

public class Zadacha36 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("введите четырехзначное число");
		int x=sc.nextInt();
		while (x>9999&&x<1000){
			System.out.println("введите четырехзначное число ещё раз");
			sc.nextInt();}
			sc.close();
		int a=x%10;
		System.out.println(a);
		int b=((x%100)-a)/10;
		System.out.println(b);
		int c=((x%1000)-a-(b*10))/100;
		System.out.println(c);
		int d=(x-a-(b*10)-(c*100))/1000;
		System.out.println(d);
		
		//
		int z1=1;
		int z2=1;
		if(a!=0)
			{if(a%2==0) {
			
		z1=z1*a;
		} 
		else {z2=z2*a;}}
		if(b!=0)
			{if(b%2==0) {
			z1=z1*b;
			} 
			else {z2=z2*b;}}
		if(c!=0)
			{if(c%2==0) {
			z1=z1*c;
			} 
			else {z2=z2*c;}}
		if(d!=0) {
		if(d%2==0) {
			z1=z1*d;
			} 
			else {z2=z2*d;}}
		int y=z1/z2;
		System.out.println("частное четных и не четных:"+y);


	}

}
