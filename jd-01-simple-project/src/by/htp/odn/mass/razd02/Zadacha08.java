package by.htp.odn.mass.razd02;

public class Zadacha08 {

	public static void main(String[] args) {
		int[] mass1= {5,7,3};
		int[] mass2= {2,4,6};
		int x=0;
		int y=0;
		for(int i=0;i<mass2.length;i++)
		{for(int k=0;k<mass2.length-1;k++)
			{for(int p=0;p<mass2.length;p++)
				{if((mass2[i]*mass2[k])%mass2[p]==0)
				{if(x!=0) {
					if(x>mass2[i]*mass2[k])
					{x=mass2[i]*mass2[k];}
					else{continue;}
					}
				else {x=mass2[i]*mass2[k];}
				}
			else {x=0;
			break;}
			}
			}
		}
		for(int i=0;i<mass1.length;i++)
		{mass1[i]=mass1[i]*(x/mass2[i]);
		mass2[i]=x;
		System.out.print(" "+mass1[i]+" ");}
		System.out.println();
		System.out.println("наименьший общий делитель="+x);
		for(int i=0;i<mass1.length;i++)
		{for(int k=0;k<mass1.length;k++)
			{if(mass1[i]<mass1[k])
				{y=mass1[k];
				mass1[k]=mass1[i];
				mass1[i]=y;}
			}
		}
		for(int i=0;i<mass1.length;i++)
		{System.out.print(" "+mass1[i]+" ");}

	}

}
