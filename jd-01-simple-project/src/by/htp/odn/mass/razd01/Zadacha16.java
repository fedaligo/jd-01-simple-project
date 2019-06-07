package by.htp.odn.mass.razd01;

public class Zadacha16 {

	public static void main(String[] args) {
		int[] mass= {1,6,8,13,67,43,13,3,9,-1,-58,-626,66,227,-14};
		int x=(mass.length/2)*2;
		int[] mass1=new int[x/2];
		//System.out.println("--"+x);
		for(int i=0;i<x;i++)
		{if(mass.length%2!=0) {mass1[i]=mass[x-1]+mass[i];
		System.out.println("cумма "+mass[x-1]+" и "+mass[i]+" = "+mass1[i]);
		
		if(i<=x) {x=x-1;}
		}
		else {mass1[i]=mass[x]+mass[i];
		System.out.println("cумма "+mass[x]+" и "+mass[i]+" = "+mass1[i]);
		
		if(i<=x) {x=x-1;}}
		}
		
		int y=mass1[0];
		for(int i=0;i<mass1.length;i++)
		{ for (int k=1;k<mass1.length;k++){
		if (mass1[i]>mass1[k])
			{if(mass1[i]>y)
				{y=mass1[i];}
			}
		else {if(mass1[k]>y)
		{y=mass1[k];}
		}
		}
		}
		System.out.println("наибольшее из полученных значений = "+y);
	}

}
