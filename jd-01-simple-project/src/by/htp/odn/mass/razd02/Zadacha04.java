package by.htp.odn.mass.razd02;

public class Zadacha04 {

	public static void main(String[] args) {
		int[] mass= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<mass.length;i++)
			{System.out.print(" "+mass[i]+" ");}
		System.out.println();
		int x=0;
		for(int i=0;i<mass.length;i++)
		{for(int k=1;k<mass.length;k++)
			{if(mass[k-1]<mass[k])
				{x=mass[k-1];
				mass[k-1]=mass[k];
				mass[k]=x;}
			else {break;}
			}
		}
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}
		System.out.println();

	}

}
