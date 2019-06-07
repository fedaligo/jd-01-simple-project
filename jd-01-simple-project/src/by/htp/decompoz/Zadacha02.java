package by.htp.decompoz;

import java.util.Scanner;

public class Zadacha02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("введите Х");
int x=sc.nextInt();
System.out.println("введите Y");
int y=sc.nextInt();
sc.close();
NOD(x,y);
System.out.println("NOD="+NOD(x,y));
NOK(x,y);
System.out.println("NOK="+NOK(x,y));
	}

	public static int NOD(int a, int b)
{int k=0;
int p=0; 
int ND=1;
int []masA=new int[100];
int []masB=new int[100];
int []masC=new int[100];
for(int i=9; i>1; i=i-1)
	{
		{while(a%i==0) {
		a=a/i;
		masA[k]=i;
		//System.out.println("делители X["+k+"]="+masA[k]);
		k=k+1;
		}
				}
	    {while(b%i==0) {
         b=b/i;
         masB[p]=i;
         //System.out.println("делители Y["+p+"]="+masB[p]);
         p=p+1;
}
}
}
for(int t=0;t<masC.length; t++)
{for(int z=0;z<masC.length; z++)
	{if(masA[t]==masB[z])
		{masC[t]=masA[t];
		if (masC[t]!=0) {ND=ND*masC[t];}
		if (masC[t]==0)
		{break;}
		//System.out.println("NOD["+t+"]="+masC[t]);
		t=t+1;
		}
				
}
}

return ND;
}
public static int NOK(int a, int b)
{int NK=(a*b)/NOD(a,b);
return NK;}
}

