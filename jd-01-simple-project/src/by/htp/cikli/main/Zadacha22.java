package by.htp.cikli.main;

import java.util.Scanner;

public class Zadacha22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double h=0.1;
		sc.close();
		double x;
		
		double y;
		if(a>b) {x=a-b;}
		else {x=b-a;}
		double z=x/h;
		for(int i=0; i<z; i++)
		{y=(a+i*h)-Math.asin(a+i*h);
		System.out.println("---"+i+"---F(x)="+y);}

	}

}
