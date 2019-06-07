package by.htp.odn.mass.razd02;

public class Zadacha05 {

	public static void main(String[] args) {
		int []mass= {23,17,36,22,89,1,74,79,55};
		int x=0;
		for(int i=1;i<mass.length;i++)
		{for(int k=i;k>0;k--)
			if(mass[k]<mass[k-1])
			{x=mass[k];
			mass[k]=mass[k-1];
			mass[k-1]=x;}
		}
		for(int i=0; i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}

	}

}
