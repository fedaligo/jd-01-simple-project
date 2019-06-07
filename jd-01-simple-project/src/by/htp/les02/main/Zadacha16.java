package by.htp.les02.main;

public class Zadacha16 {

	public static void main(String[] args) {
		int a=1234;
		int x=1;
		for (int i=0; i<4; i++) {
			x=x*(a%10);
			a=a/10;
			
		}
		System.out.println("произведение цифр:"+x);

	}

}
