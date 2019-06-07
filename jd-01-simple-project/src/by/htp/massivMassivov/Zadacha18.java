package by.htp.massivMassivov;

import java.util.Scanner;

public class Zadacha18 {

	public static void main(String[] args) {
int y=0;
int z=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите размерность массива");
		int x=sc.nextInt();
		sc.close();
		int [][]mass=new int[x][x];
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length-y;j++)
			{ 
			mass[i][j]=z;
			
			System.out.printf("%2d",mass[i][j]);
			}
			for(int j=mass[i].length-y;j<mass[i].length;j++)
			{ 
			mass[i][j]=0;
			
			System.out.printf("%2d",mass[i][j]);
			}
			z=z+1;
			y=y+1;
			System.out.println();
		}
		
	}

}
