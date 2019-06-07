package by.htp.odn.mass.razd02;

public class Zadacha10 {

	public static void main(String[] args) {
		int[] mass1= {1,0,2,4,1,2,1,1,4,3,4,1,0,3};
		int[]mass2=new int[mass1.length];
		int[]mass= new int[mass1.length];
		int x=0;
		for(int i=0;i<mass2.length;i++)
			{mass2[i]=-1;}
		
		for(int c=0;c<mass.length;c++)//переходит в следующую €чейку подсчета
			{for(int i=0;i<mass1.length;i++)//считает одинаковые значени€
				{
				if(mass1[i]==c)
				{mass[c]=mass[c]+1;
				}
				else {continue;}
				}
			}
		for(int q=0;q<mass.length;q++)
		{System.out.print(" "+mass[q]+" ");}
		System.out.println();
		for(int c=0;c<mass.length;c++)//перебирает €чейки с информацией о количестве повторений
			{if(mass[c]==0) {continue;}
				{for(int p=0;p<=c;p++)
				{x=x+mass[p];}
				for(int k=x-mass[c];k<x;k++)//записывает значение в €чейку
				{
				mass2[k]=c;
				}
			x=0;
			}
			}
		for(int q=0;q<mass2.length;q++)
		{System.out.print(" "+mass2[q]+" ");}
		System.out.println();
	}

}
