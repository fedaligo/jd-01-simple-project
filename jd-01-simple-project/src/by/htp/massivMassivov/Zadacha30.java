package by.htp.massivMassivov;

import java.util.Random;


public class Zadacha30 {

	public static void main(String[] args) {
		Random rand=new Random();
		int x=0;

		int[][]mass=new int[10][15];
		for(int i=0;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{mass[i][j]=rand.nextInt(6);
			System.out.printf("%5d",mass[i][j]);}
		System.out.println();
		}
		for(int i=0;i<mass.length;i++)
		{for(int j=0;j<mass[i].length;j++)
			{if(mass[i][j]==5) {x=x+1;}
			if(j==mass[i].length-1){
				if(x>=3) {System.out.println("Строка номер "+i+" имеет "+x+" повторений цифры 5");}
				}
			}
		x=0;
		}
	}

}
