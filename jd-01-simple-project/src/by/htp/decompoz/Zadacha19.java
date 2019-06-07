package by.htp.decompoz;

import java.util.Scanner;

public class Zadacha19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		System.out.println("сумма значений="+summNCH(x));
			}
	
	public static int summNCH(int a)
	{double []mass=new double[a];
	int y=0;
	int b=(int) Math.pow(10,a-1);
	System.out.println(b);
	int c=(int) Math.pow(10, a)-1;
	System.out.println(c);
	int f=c-b+1;
	System.out.println(f);
	int[] massB=new int[f];
	for(int p=0; p<massB.length; p++) 
	{
		for(int k=0; k<a; k++)
		{
		if(k==0) {System.out.println("прохожу круг №"+k);
			mass[k]=(b%Math.pow(10, k+1));
		
		
				}
		else { System.out.println("прохожу круг №"+k);
			mass[k]=(((b%Math.pow(10, k+1))-(b%Math.pow(10, k)))/Math.pow(10, k));
			}
		if(mass[k]%2==0&&mass[k]!=0) {
			massB[p]=0;
			break;			}
		else {massB[p]=b;}
		}
	if(massB[p]==0) {
		System.out.println("значение имеет четную цифру");
		}
	else{
		
		System.out.println("подходящее значение "+b);
		}
	if (b>=c) {break;}
	b=b+1;
	}
	for(int x=0; x<massB.length;x++)
		{y=y+massB[x];}
		return y;}
	
	

}
