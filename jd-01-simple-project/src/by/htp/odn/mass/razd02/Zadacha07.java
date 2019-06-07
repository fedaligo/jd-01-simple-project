package by.htp.odn.mass.razd02;

public class Zadacha07 {

	public static void main(String[] args) {
		int[] mass1= {1,2,3,5,7,9,11,12,14,15,17,18,19,22};
		int[] mass2= {4,6,8,10,13,16,20};
		int x=1;
		int a=0;
		int k=0;
		int m1=0;
		int[] mass=new int[mass1.length+mass2.length];
		
		if(mass1.length>mass2.length) 
		{
		for(int i=0;i<mass2.length;i++)
		{
		if(mass2[a]>mass1[m1]&&mass2[a]<mass1[m1+1])
			if(i==0)
			{
			{k=i+k;
			mass[k]=mass1[m1];
			mass[k+1]=mass2[i];
			
			m1=m1+1;
			a=a+1;
			}
			}
			else {
				k=i+x;
				mass[k]=mass1[m1];
				mass[k+1]=mass2[i];
				x=x+1;
				m1=m1+1;
				a=a+1;
			}
		
		else 
			{if(i==0)
				{mass[k]=mass1[m1];
				m1=m1+1;
				k=k+1;
				i=i-1;
				x=x+1;
			}
			else {k=i+x;
				mass[k]=mass1[m1];
				m1=m1+1;
				k=k+1;
				i=i-1;
				x=x+1;
			}
			}
		}
		{k=k+2;
		if(k<mass.length)
		{
		for (;k<mass.length;k++)
			{
			mass[k]=mass1[m1];
			m1=m1+1;
			}
		}
		}
		{k=k+2;
		if(k<mass.length)
		{
		for (;k<mass.length;k++)
			{
			mass[k]=mass1[m1];
			m1=m1+1;
			}
		}
		}
		}
		else {
			for(int i=0;i<mass1.length;i++)
			{
			if(mass1[a]>mass2[m1]&&mass1[a]<mass2[m1+1])
				if(i==0)
				{
				{k=i+k;
				mass[k]=mass2[m1];
				mass[k+1]=mass1[i];
				
				m1=m1+1;
				a=a+1;
				}
				}
				else {
					k=i+x;
					mass[k]=mass2[m1];
					mass[k+1]=mass1[i];
					x=x+1;
					m1=m1+1;
					a=a+1;
				}
			
			else 
				{if(i==0)
					{mass[k]=mass2[m1];
					m1=m1+1;
					k=k+1;
					i=i-1;
					x=x+1;
				}
				else {k=i+x;
					mass[k]=mass2[m1];
					m1=m1+1;
					k=k+1;
					i=i-1;
					x=x+1;
				}
				}
			}
			{k=k+2;
			if(k<mass.length)
			{
			for (;k<mass.length;k++)
				{
				mass[k]=mass2[m1];
				m1=m1+1;
				}
			}
			}
			
		}
		
		for	(int n=0;n<mass.length;n++)
		{System.out.print(" "+mass[n]+" ");}
		System.out.println();
	}

}
