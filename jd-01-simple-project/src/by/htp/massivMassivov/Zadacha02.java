package by.htp.massivMassivov;

import java.util.Random;

public class Zadacha02 {

	public static void main(String[] args) {
		Random rand=new Random();
		int [][]mass=new int[2][3];
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j++) {
				mass[i][j]=rand.nextInt(10);
				System.out.printf("-%1d-",mass[i][j]);
			}
			System.out.println();
		}
		

	}

}
