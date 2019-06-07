package by.htp.massivMassivov;

public class Zadacha01 {

	public static void main(String[] args) {
		int[][]mass=new int[4][3];
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j++) {
				if(j==0) {
					mass[i][j]=1;
				}
				else {
					mass[i][j]=0;
				}
			}
		}
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j++) {
			System.out.printf("[%4d]", mass[i][j]);	
			}
			System.out.println();
			}

	}

}
