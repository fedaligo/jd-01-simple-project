package by.htp.decompoz;

import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("введите первое значение для сравнения не более 10 символов");
		int x=sc.nextInt();
		System.out.println("введите второе значение для сравнения не более 10 символов");
		int y=sc.nextInt();
				sc.close();
		System.out.println("в числе "+massX(x,y)+" больше цифр");

	}
	public static int massX(int a,int a1)
	{int[]mass1=new int[100];
	int[]mass2=new int[100];
	int x = 1;
	int y = 1;
	for(int b=0;b<100;b++)
	{
		if(b==0) {mass1[b]=(int) (a%Math.pow(10, b+1));
		if(mass1[b]==0) {x=b;break;}
		
		}
		else{mass1[b]=(int) (((a%Math.pow(10, b+1))-(a%Math.pow(10, b)))/Math.pow(10, b));
		if(mass1[b]==0) {x=b;break;}
		
		}
		}
	for(int c=0;c<100;c++)
	{
		if(c==0) {mass2[c]=(int) (a1%Math.pow(10, c+1));
		if(mass2[c]==0) {y=c;break;}
		
		}
		else{mass2[c]=(int) (((a1%Math.pow(10, c+1))-(a1%Math.pow(10, c)))/Math.pow(10, c));
		if(mass2[c]==0) {y=c;break;}
		
		}}
		if(x>y) {return a;}
		else {return a1;}}

}
