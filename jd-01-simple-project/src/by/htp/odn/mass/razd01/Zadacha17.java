package by.htp.odn.mass.razd01;

public class Zadacha17 {

	public static void main(String[] args) {
		int[] mass= {1,6,8,13,-626,43,13,3,-626,-1,-58,-626,66,-626,-6};
		int x=mass.length;
		int y=mass[0];
		
		
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
		System.out.println("y="+y);
		for(int i=0;i<mass.length;i++)
		{if(mass[i]==y) {
			for(int k=i;k<mass.length-1;k++)
			{mass[k]=mass[k+1];
			
			}
			x=x-1;
			
		}
		}
		for(int p=0;p<x;p++)
		{System.out.println(mass[p]);}
		
	}

}
