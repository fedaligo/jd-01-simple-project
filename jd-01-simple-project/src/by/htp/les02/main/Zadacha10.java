package by.htp.les02.main;

public class Zadacha10 {

	public static void main(String[] args) {
		
		double a=90;
		double b=30;
		double x=Math.toRadians(a);
		double y=Math.toRadians(b);
		
		double z=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.asin(y)))*Math.tan(x*y);
		System.out.println("значение равно:"+z);
	}

}
