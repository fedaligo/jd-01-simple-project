package by.htp.les02.main;

public class Zadacha21 {

	public static void main(String[] args) {
		int a=9854;
		int x=a%3600;
		int b=x%60;
		int c=(a-x)/3600;
		int y=(x-b)/60;
			
		
		System.out.println("часы:"+c);
		System.out.println("минуты:"+y);
		System.out.println("секунды:"+b);

	}

}
