package by.htp.massivMassivov;

import java.util.Scanner;

public class Zadacha21 {

	public static void main(String[] args) {
		int y=0;
		
				Scanner sc=new Scanner(System.in);
				System.out.println("¬ведите размерность массива");
				int x=sc.nextInt();
				sc.close();
				int w=x;
				
				int [][]mass=new int[x][x];
				for(int z=0;z<x;z++) {
				y=0;
					for(int i=0;i<mass.length;i++) {
				
					for(int j=0;j<mass[i].length;j++)
					{ if(i==y+z&&j==y) {mass[i][j]=w;
					y=y+1;
					}
				}
				}
					w=w-1;
				}
				for(int i=0;i<mass.length;i++) {
					
					for(int j=0;j<mass[i].length;j++)
					{System.out.printf("%2d",mass[i][j]);}
					System.out.println();}
	}

}
