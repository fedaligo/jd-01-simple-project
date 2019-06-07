package by.htp.massivMassivov;

public class Zadacha07 {

	public static void main(String[] args) {
		int[][]mass=new int[][] {{-1,-2,3,-4,5},{-3,4,-5,6,7},{6,-7,-8,-9,0},{-1,-2,3,4,5},{-8,4,-8,6,7}};
		int x=0;
		for(int i=0;i<mass.length;i++) {
			for(int j=1;j<mass[i].length;j=j+2) {
				if(mass[i][j]<0) {x=x+Math.abs(mass[i][j]);
				System.out.println(x);}
			}
			}
		
	}

}
