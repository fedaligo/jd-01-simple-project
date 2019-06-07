package by.htp.odn.mass.razd01;

public class Zadacha09 {

	public static void main(String[] args) {
		int[] mass= {1,6,8,13,67,43,13,3,9,-1,-58,-626,66,227,-14};
		for(int i=0;i<mass.length;i++)
			{System.out.print(" "+mass[i]);}
		System.out.println();
		int x=mass[0];
		int y=mass[0];
		int a = 0;
		int b = 0;
		for(int i=0;i<mass.length;i++)
		{for(int k=1;k<mass.length;k++)
			{if(mass[k]>mass[i])
				{if(mass[k]>x) 
				{x=mass[k];
				a=k;}
				if(mass[i]<y)
				{y=mass[i];
				b=i;}
				}
			else {if(mass[i]>x) 
			{x=mass[i];
			a=i;}
			if(mass[k]<y)
			{y=mass[k];
			b=k;}
			}
			}
		
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		mass[a]=y;
		mass[b]=x;
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]);}
	}

}
