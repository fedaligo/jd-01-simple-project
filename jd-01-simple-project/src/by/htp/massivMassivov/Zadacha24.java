package by.htp.massivMassivov;

import java.util.Random;
import java.util.Scanner;

public class Zadacha24 {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		int[][]mass=new int[x][x];
		for(int i=0;i<mass[0].length;i++)
		{mass[0][i]=rand.nextInt(10);
		System.out.printf("%5d",mass[0][i]);}
		System.out.println();
		for(int i=1;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{mass[i][j]=(int) Math.pow(mass[0][j], (i+1));
			System.out.printf("%5d",mass[i][j]);}
		System.out.println();
		}

	}

}
