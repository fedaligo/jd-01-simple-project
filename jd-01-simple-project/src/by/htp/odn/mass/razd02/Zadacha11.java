package by.htp.odn.mass.razd02;

public class Zadacha11 {

	public static void main(String[] args) {
		int[] mass1= {1,1,2,4,2,7,1,7,4,3,4,7,0,3};
		int[] mass2=new int[mass1.length];
		int x=0;
		int y=0;
		int z=0;
		mass2[x]=mass1[x];
		mass1[x]=-1;
		for(int i=1;i<mass1.length;i++)
		{
			if(mass2[x]<mass1[i]) {
				x=x+1;
				mass2[x]=mass1[i];
				mass1[i]=-1;
				
				if(x==3) {break;}
			}
		}
		for(int i=0;i<mass1.length;i++)
		{
			for(int k=0;k<=mass2.length;k++)
			{
				if(mass1[i]==-1) {break;}
				else {if(mass1[i]<=mass2[k])
						{y=mass2[k];
						mass2[k]=mass1[i];
						for(int f=k+1;f<mass2.length;f++)
							{z=mass2[f];
							mass2[f]=y;
							y=z;
							if(f<mass2.length) {z=mass2[f+1];}
							}
						}
				}
			}
		}
		for(int i=0;i<mass1.length;i++)
		{System.out.print(" "+mass1[i]+" ");}
		System.out.println();
		for(int i=0;i<mass2.length;i++)
		{System.out.print(" "+mass2[i]+" ");}
		System.out.println();
	}

}
