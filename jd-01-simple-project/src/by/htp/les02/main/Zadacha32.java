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
		System.out.println("������� ����� �� 0 �� 23");
		m=sc.nextInt();
		
		while (m>23||m<0) {System.out.println("�������� ������� ����� �� 0 �� 23");
		m=sc.nextInt();
		}
		System.out.println("������� ����� �� 0 �� 59");
		n=sc.nextInt();
		
		while ((n>59)||(n<0)) {System.out.println("�������� ������� ����� �� 0 �� 59");
		n=sc.nextInt();
		}
		System.out.println("������� ����� �� 0 �� 59");
		k=sc.nextInt();
		
		while ((k>59)||(k<0)) {System.out.println("�������� ������� ����� �� 0 �� 59");
		k=sc.nextInt();
		}
		System.out.println("����� ������� ���������� �� ����");
		System.out.println("������� ���������� ����� �� 0 �� 23");
		p=sc.nextInt();
		
		while (p>23||p<0) {System.out.println("�������� ������� ���������� ����� �� 0 �� 23");
		p=sc.nextInt();
		}
		System.out.println("������� ���������� ����� �� 0 �� 59");
		q=sc.nextInt();
		
		while ((q>59)||(q<0)) {System.out.println("�������� ������� ���������� ����� �� 0 �� 59");
		q=sc.nextInt();
		}
		System.out.println("������� ���������� ������ �� 0 �� 59");
		c=sc.nextInt();
		
		while ((c>59)||(c<0)) {System.out.println("�������� ������� ���������� ������ �� 0 �� 59");
		c=sc.nextInt();
		}
		x=m+p;
		if (x>23) {x=x-23;}
		y=n+q;
		if (y>59) {y=y-59;}
		z=k+c;
		if (z>59) {z=z-59;}
		System.out.print("������� �����: "+x+" ����� "+y+" ����� "+z+" ������ ");
		sc.close();

	}

}
