package by.htp.les01.logic.main;

public class BeerSong {
	public static void song() {
	int x=10;
	String beer="бутылок";
	while (x>0) {
		if (x==1)
		{
			beer="бутылка";
		}
		System.out.println(x+" "+beer+" на столе");
		System.out.println("возьми одну");
		System.out.println("пусти по кругу");
		x=x-1;
		if (x>0)
		{
			if (x==1)
		{
			beer="бутылка";
		}
			System.out.println(x+" "+beer+" на столе");
		}
		else
		{
			System.out.println("нет бутылок на столе");
		}
	}
}
}

