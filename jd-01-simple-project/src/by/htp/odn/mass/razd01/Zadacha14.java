package by.htp.odn.mass.razd01;

public class Zadacha14 {

	public static void main(String[] args) {
		int[] mass= {1,6,8,13,67,43,13,3,9,-1,-58,-626,66,227,-14};
		int x=mass[0];
		int y=mass[0];
		for(int i=0;i<mass.length;i=i+2)
		{
			for(int k=2;k<mass.length;k=k+2)
			{if(mass[k]>mass[i])
				{if(mass[k]>x) 
				{x=mass[k];}
				}
			else {if(mass[i]>x) 
			{x=mass[i];}
			}
			}
		}
		for(int i=1;i<mass.length;i=i+2)
		{
		for(int k=1;k<mass.length;k=k+2)
		{if(mass[k]>mass[i])
			{
			if(mass[i]<y)
			{y=mass[i];}
			}
		else {
		if(mass[k]<y)
		{y=mass[k];}
		}
		}
		
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("max(чет)+min(нечет)="+(x+y));
	}

}
