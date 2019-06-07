package by.htp.les02.main;


public class Zadacha33 {

	public static void main(String[] args) {
		char x='s';
		int y=x;
		System.out.println("номер символа "+y);
		System.out.println("номер предыдущего символа "+(y-1));
		System.out.println("номер следующего символа "+(y+1));
		char a=(char)y;
		char b=(char)(y-1);
	char c=(char)(y+1);
	System.out.println("ваш символ "+a);
	System.out.println("предыдущий символ "+(b));
	System.out.println("следующий символ "+(c));
	}
}
