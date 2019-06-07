package by.htp.massivMassivov;

public class Zadacha03 {

	public static void main(String[] args) {
		int[][]mass=new int[][] {{1,2,3,4,5},{3,4,5,6,7},{6,7,8,9,0},{1,2,3,4,5}};
		for(int i=0;i<mass.length;i++) {
			for(int j=0;j<mass[i].length;j=j+mass[i].length-1) {
				System.out.printf("%4d",mass[i][j]);
			}
			System.out.println();
		}
		

	}

}
