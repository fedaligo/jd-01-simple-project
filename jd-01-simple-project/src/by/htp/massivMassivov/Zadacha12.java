package by.htp.massivMassivov;


import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
		int y=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������� ����������� �������");
		int x=sc.nextInt();
		sc.close();
		int [][]mass=new int[x][x];
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j++)
			{if(i==y&&j==y) 
			{mass[i][j]=y;
			y=y+1;}
			System.out.printf("%2d",mass[i][j]);
			}
			System.out.println();
		}

	}

}
