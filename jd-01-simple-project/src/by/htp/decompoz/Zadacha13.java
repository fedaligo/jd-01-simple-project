package by.htp.decompoz;

import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		massX(x);

	}
	public static int[] massX(int a)
	{int[]mass=new int[100];
	for(int b=0;b<100;b++)
	{
		if(b==0) {mass[b]=(int) (a%Math.pow(10, b+1));
		if(mass[b]==0) {break;}
		System.out.println("элемент массива №"+b+"="+mass[b]);}
		else{mass[b]=(int) (((a%Math.pow(10, b+1))-(a%Math.pow(10, b)))/Math.pow(10, b));
		if(mass[b]==0) {break;}
		System.out.println("элемент массива №"+b+"="+mass[b]);}}
		
	return mass;}

}
