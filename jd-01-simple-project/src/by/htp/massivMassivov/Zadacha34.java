package by.htp.massivMassivov;


import java.util.Scanner;

public class Zadacha34 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите размерность матрицы");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		int z=1;
		int[][]mass=new int[x][y];
		for(int i=0;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{if(j>=z&&j<mass[i].length) {mass[i][j]=1;}
			System.out.printf("%5d",mass[i][j]);}
		z=z+1;
		System.out.println();
		}

	}

}
