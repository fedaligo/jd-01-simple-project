package by.htp.massivMassivov;

import java.util.Random;
import java.util.Scanner;

public class Zadacha27 {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[]rez=new int[x];
		int[][]mass=new int[x][y];
		for(int i=0;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{mass[i][j]=rand.nextInt(10);
			System.out.printf("%5d",mass[i][j]);}
		System.out.println();
		}
		System.out.println("¬ведите номера столбцов, которые нужно помен€ть");
		int a=sc.nextInt();
		while(a<0||a>x-1) {System.out.println("введите число заново");
		a=sc.nextInt();}
		int b=sc.nextInt();
		while(b<0||b>y-1) {System.out.println("введите число заново");
		b=sc.nextInt();}
		sc.close();
		for(int i=0;i<x;i++)
		{rez[i]=mass[i][a];
		mass[i][a]=mass[i][b];
		mass[i][b]=rez[i];}
		for(int i=0;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{
			System.out.printf("%5d",mass[i][j]);}
		System.out.println();
		}
		
	}

}
