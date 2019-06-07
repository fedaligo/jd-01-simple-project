package by.htp.odn.mass.razd02;

import java.util.Random;
import java.util.Scanner;

public class Zadacha01 {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] mass1=new int[10];
		int[] mass2=new int[20];
		int[] mass=new int[31];
		int x=0;
		System.out.println("первый массив");
		for(int i=0;i<mass1.length;i++)
		{mass1[i]=rand.nextInt(10);
		System.out.print(mass1[i]+" ");}
		System.out.println();
		System.out.println("второй массив");
		for(int i=0;i<mass2.length;i++)
		{mass2[i]=rand.nextInt(10);
		System.out.print(mass2[i]+" ");}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("введите число от 0 до 10 для совмещения массивов с данного элемента");
		int a=sc.nextInt();
		
		while(a>10||a<0)
		{System.out.println("введите число ещё раз");
		a=sc.nextInt();}
		sc.close();
		int y=a;
		System.out.println("новый совмещенный массив");
		for(int i=0;i<a;i++)
		{mass[i]=mass1[i];
		System.out.print(mass[i]+" ");}
		System.out.print("   ");
		for(int i=a;i<mass2.length+a;i++)
		{mass[i]=mass2[x];
		x=x+1;
		System.out.print(mass[i]+" ");}
		System.out.print("   ");
		for(int i=mass2.length+a+1;i<mass.length;i++)
		{mass[i]=mass1[y];
		y=y+1;
		System.out.print(mass[i]+" ");}
		

	}

}
