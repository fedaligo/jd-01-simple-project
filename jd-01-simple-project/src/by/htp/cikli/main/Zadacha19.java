package by.htp.cikli.main;

public class Zadacha19 {

	public static void main(String[] args) {
		int x = 1000;
		double e=0.001;
		double a=0;
		int b=0;
		for(int i=0; i<=x; i++)
		{a=1/(Math.pow(2, i)+1/(Math.pow(3, i)));
		if(a>=e) {b=b+i;
		System.out.println(b);}
				}

	}

}
