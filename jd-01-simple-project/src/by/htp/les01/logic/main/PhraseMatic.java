package by.htp.les01.logic.main;

public class PhraseMatic {
public static void phrase(){
	String[] wordlistOne= {"������","��� ����","�����","�������","��������","�����������"};
	String[] wordlistTwo= {"����","��� �����","�������","�������������"};
	String[] wordlistThree= {"���������","����","����","���� �������","�������"};
	int oneLength=wordlistOne.length;
	int twoLength=wordlistTwo.length;
	int threeLength=wordlistThree.length;
	int rand1=(int) (Math.random()*oneLength);
	int rand2=(int) (Math.random()*twoLength);
	int rand3=(int) (Math.random()*threeLength);
	String phrase=wordlistOne[rand1]+" "+wordlistTwo[rand2]+" "+wordlistThree[rand3];
	System.out.println("�� ��� ��� ����� - ��� "+phrase);
}
}
