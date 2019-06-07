package by.htp.les02.main;


public class Zadacha08 {

	public static void main(String[] args) {
		int a=1;
		int b=5;
		int c=3;
		
		double x;
		double y;
		int z;
		
		x= Math.pow(b, 2)+4*a*c;
		y=((b+Math.sqrt(x))/(2*a))-Math.pow(a, 3)*c+Math.pow(b, -2);
		z=(int)y;
		System.out.println("результат:"+z);

	}

}
