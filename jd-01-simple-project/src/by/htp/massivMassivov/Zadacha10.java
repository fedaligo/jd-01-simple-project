package by.htp.massivMassivov;

import java.util.Random;
import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		Random rand=new Random();
		int [][]mass=new int[10][10];
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j++) {
				mass[i][j]=rand.nextInt(10);
				System.out.printf("-%1d-",mass[i][j]);
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("введите номер строки");
		int x=sc.nextInt();
		if(x>9||x<0) {System.out.println("введите номер строки ещё раз");
		x=sc.nextInt();}
		for(int i=0;i<mass[x].length;i++) {
			System.out.printf("[%1d]",mass[x][i]);
		}
		System.out.println();
		System.out.println("введите номер столбца");
		int y=sc.nextInt();
		if(y>9||y<0) {System.out.println("введите номер столбца ещё раз");
		y=sc.nextInt();}
		sc.close();
		
		for(int i=0;i<mass.length;i++) {
			System.out.printf("[%1d]",mass[i][y]);
		}
		System.out.println();
	}

}
