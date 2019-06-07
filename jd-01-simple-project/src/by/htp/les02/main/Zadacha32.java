package by.htp.les02.main;
import java.util.Scanner;
public class Zadacha32 {

	public static void main(String[] args) {
		int m;
		int n;
		int k;
		int p;
		int q;
		int c;
		int x;
		int y;
		int z;
		Scanner sc=new Scanner(System.in);
		System.out.println("введите число от 0 до 23");
		m=sc.nextInt();
		
		while (m>23||m<0) {System.out.println("повторно введите число от 0 до 23");
		m=sc.nextInt();
		}
		System.out.println("введите число от 0 до 59");
		n=sc.nextInt();
		
		while ((n>59)||(n<0)) {System.out.println("повторно введите число от 0 до 59");
		n=sc.nextInt();
		}
		System.out.println("введите число от 0 до 59");
		k=sc.nextInt();
		
		while ((k>59)||(k<0)) {System.out.println("повторно введите число от 0 до 59");
		k=sc.nextInt();
		}
		System.out.println("через сколько посмотреть на часы");
		System.out.println("введите количество часов от 0 до 23");
		p=sc.nextInt();
		
		while (p>23||p<0) {System.out.println("повторно введите количество часов от 0 до 23");
		p=sc.nextInt();
		}
		System.out.println("введите количество минут от 0 до 59");
		q=sc.nextInt();
		
		while ((q>59)||(q<0)) {System.out.println("повторно введите количество минут от 0 до 59");
		q=sc.nextInt();
		}
		System.out.println("введите количество секунд от 0 до 59");
		c=sc.nextInt();
		
		while ((c>59)||(c<0)) {System.out.println("повторно введите количество секунд от 0 до 59");
		c=sc.nextInt();
		}
		x=m+p;
		if (x>23) {x=x-23;}
		y=n+q;
		if (y>59) {y=y-59;}
		z=k+c;
		if (z>59) {z=z-59;}
		System.out.print("текущее время: "+x+" часов "+y+" минут "+z+" секунд ");
		sc.close();

	}

}
