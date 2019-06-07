package by.htp.cikli.main;

import java.util.Scanner;

public class Zadacha32 {

	public static void main(String[] args) {
		//String str=new String("_8fghd(345__*");
		Scanner s=new Scanner(System.in);
		System.out.println("введите строку сиволов для проверки");
		String str=s.next();
		s.close();
		int y=0;
		char[] mass=str.toCharArray();
		char[] mass1= {'a','b','c','z','i','f','g','h','j','k'};
		char[] mass2= {'0','1','2','3','4','5','6','7','8','9'};
		//System.out.println(str.toCharArray());
		for(int i=0;i<mass.length;i++)
		{if(i==0) {
			if(mass[i]!='_') {
				for(int k=0;k<mass1.length;k++)
				{if(mass[i]==mass1[k]) {
					System.out.println("символ №"+(i+1)+" правильный");
					y=y+1;
					break;}			
				
				}
				//System.out.println("символ №"+(i+1)+" не правильный");
				if(y==0) {System.out.println("символ №"+(i+1)+" не правильный");}
				}
			else{System.out.println("символ №"+(i+1)+" правильный");}
		}
		
		if(i>0) {
			if(mass[i]!='_') {
			for(int k=0;k<mass1.length;k++)
			{if(mass[i]==mass1[k]) {
				System.out.println("символ №"+(i+1)+" правильный");
				y=y+1;
				break;}			
			//System.out.println("сравниваю символ №"+(i+1)+" с буквой");
			}
			if(y==0){
				for(int k=0;k<mass2.length;k++)
				{if(mass[i]==mass2[k]) {
					System.out.println("символ №"+(i+1)+" правильный");
					y=y+1;
					break;}			
				//System.out.println("сравниваю символ №"+(i+1)+" с цифрой");
				}
			}
			if(y==0) {System.out.println("символ №"+(i+1)+" не правильный");}
			//
			}
		else{System.out.println("символ №"+(i+1)+" правильный");}
		y=0;
		}
		}

	}

}
