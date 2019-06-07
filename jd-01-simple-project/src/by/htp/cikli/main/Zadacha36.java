package by.htp.cikli.main;
public class Zadacha36 {

	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		
		boolean zn=false;
		
			for(int i = 0;i<89;i++)
				{x=10+i;
				for(int p=0;p<89;p++)
					{y=10+p;
					System.out.println("x="+x+" y="+y);
					if((x*100+y)%(x*y)==0)
						{zn=true;
						break;}
					else {continue;}
					}
				if (zn==true)
				{System.out.println("ваш Х="+x);
				System.out.println("ваш Y="+y);
				break;}
				}
	}

}
