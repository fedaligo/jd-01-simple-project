package by.htp.les01.logic.main;

public class BeerSong {
	public static void song() {
	int x=10;
	String beer="�������";
	while (x>0) {
		if (x==1)
		{
			beer="�������";
		}
		System.out.println(x+" "+beer+" �� �����");
		System.out.println("������ ����");
		System.out.println("����� �� �����");
		x=x-1;
		if (x>0)
		{
			if (x==1)
		{
			beer="�������";
		}
			System.out.println(x+" "+beer+" �� �����");
		}
		else
		{
			System.out.println("��� ������� �� �����");
		}
	}
}
}

