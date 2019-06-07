package by.htp.odn.mass.razd02;

public class Zadacha09 {

	public static void main(String[] args) {
		int []mass= {2,58,-1,-77,5,-18,7,33,-11,45,67,22,11,-13,54,36,64,62,-15,-10,63,66};
		int y=mass.length/2;
		int x=0;
		int z=0;
		int w=0;
		
		for(int i=2;i<=y;i=i*2) //этот цикл задаёт шаг для массива
			{if(mass.length%i==0) {
			for(int p=0;p<mass.length;p=p+i)//этот цикл шагает от одного отрезка к другому 
				{for(int c=0;c<p+i;c++)//эти два цикла сравнивают значения в отрезке
					{for(int k=0;k<p+i;k++)
						if(mass[c]<mass[k])
							{x=mass[k];
							mass[k]=mass[c];
							mass[c]=x;}
					}
				}
			}
			else {z=mass.length%i;
			for(int p=0;p<mass.length-z;p=p+i)//этот цикл шагает от одного отрезка к другому 
			{for(int c=0;c<p+i;c++)//эти два цикла сравнивают значения в отрезке
				{for(int k=0;k<p+i;k++)
					if(mass[c]<mass[k])
						{x=mass[k];
						mass[k]=mass[c];
						mass[c]=x;}
				}
			}
			for(int p=mass.length-z;p<=mass.length;p=p+1)//этот цикл шагает от одного отрезка к другому 
			{for(int c=p;c<mass.length;c++)//эти два цикла сравнивают значения в отрезке
				{for(int k=p;k<mass.length;k++)
					if(k!=mass.length) {
						if(mass[c]<mass[k])
						{x=mass[k];
						mass[k]=mass[c];
						mass[c]=x;}
						}
				}
			}
			if(i*2>mass.length)
			{for(int c=0;c<mass.length-z;c++)//эти два цикла сравнивают значения в отрезке
			{for(int k=mass.length-z;k<=mass.length;k++)
					if(mass[c]>mass[k])
					{x=mass[c];
					mass[c]=mass[k];
					for(int r=c+1;r<mass.length;r++)
						{w=mass[r];
						mass[r]=x;
						x=w;
						w=mass[r+1];
						
						}
					}
					else {break;}
					
			}
			}
			}
			
			
			
			
			
			}
		for(int u=0;u<mass.length;u++)
		{System.out.print(" "+mass[u]+" ");}
		System.out.println();
			
	}

}
