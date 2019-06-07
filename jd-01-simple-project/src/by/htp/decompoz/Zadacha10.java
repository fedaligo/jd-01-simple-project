package by.htp.decompoz;



public class Zadacha10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double x=1;
double y=9;

System.out.println("произведение факториалов="+proizv_fc(x,y));
	}
	
	
	public static double proizv_fc(double a, double b)
	{
		double x=1;
		double z=1;
		double[] mas=new double[100];
	for (int f=0;f<9;f++)
	{
		
	for (int y=9-f;y>0;y=y-1)
		{
		x=x*y;
		
		}
	if((9-f)%2!=0)
		{mas[f]=x;
		z=z*mas[f];
	
		
	System.out.println("факториал числа "+(9-f)+"="+mas[f]);
	//System.out.println("произведение факториалов="+z);
	}
	
	x=1;
	}
	return z;
		
	/*for (int z=0;z<10;z++) {
		fc=mas[z]*fc;
	}*/
		
	}
	
}
