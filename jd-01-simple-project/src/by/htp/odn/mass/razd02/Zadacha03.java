package by.htp.odn.mass.razd02;

public class Zadacha03 {

	public static void main(String[] args) {
		int [] mass= {0,1,2,3,4,5,6,7,8,9};
		int x=0;
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}
		System.out.println();
		for(int i=0; i<mass.length/2;i++)
		{
			x=mass[i];
			mass[i]=mass[mass.length-1-i];
		mass[mass.length-1-i]=x;
		
		
		}
		for(int i=0;i<mass.length;i++)
		{System.out.print(" "+mass[i]+" ");}

	}

}
