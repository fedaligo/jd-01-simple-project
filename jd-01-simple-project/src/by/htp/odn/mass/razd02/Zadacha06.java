package by.htp.odn.mass.razd02;

public class Zadacha06 {

	public static void main(String[] args) {
		int [] mass= {-1,10,46,-31,-14,-55,17,33,0};
		int x=0;
		int y=0;
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}
		System.out.println();
		for(int i=0;i<mass.length;i++)
		{for(int k=i;k<mass.length;k++)
			{if(mass[y]>=mass[k])
				{x=mass[y];
				mass[y]=mass[k];
				mass[k]=x;
				
				}
			}
		for(int n=0;n<mass.length;n++)
		{System.out.print(" "+mass[n]+" ");}
		System.out.println();
		y=i+1;
		}
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}
		System.out.println();

	}

}
