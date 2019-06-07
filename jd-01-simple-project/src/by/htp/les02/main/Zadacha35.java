package by.htp.les02.main;
import java.math.*;
import java.util.Scanner;

public class Zadacha35 {

	public static void main(String[] args) {
		
		int dr;
		Scanner sc=new Scanner(System.in);
		System.out.println("введите число М");
		int m=sc.nextInt();
		System.out.println("введите число N");
		int n=sc.nextInt();
		while (m<1&&n<1){
			System.out.println("введите числа ещё раз");
			m=sc.nextInt();
			n=sc.nextInt();
			}
		double x=m/n;
		int y=(int)x;
		int z;
		for (int i=0; i<20; i++){
		double[] tb=new double[i];
		
		tb[i]=(((y%Math.pow(10,(i+1))-tb[i]))/Math.pow(10,(i)));
		System.out.println("наибольшее целое"+tb[i]);
			/*
			 * if(i==2){ if(tb[i]>tb[i-1]){z=tb[i];} else {z=tb[i-1];} } if(i>=3){
			 * if(tb[i]>z){ System.out.println("наибольшее целое"+tb[i]);} else
			 * {System.out.println("наибольшее целое"+z);} }
			 */

	}

}}
