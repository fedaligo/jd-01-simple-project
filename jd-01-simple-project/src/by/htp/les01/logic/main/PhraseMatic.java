package by.htp.les01.logic.main;

public class PhraseMatic {
public static void phrase(){
	String[] wordlistOne= {"привет","как дела","диван","кровать","дроссель","конденсатор"};
	String[] wordlistTwo= {"пока","иди вперёд","трактор","умозаключение"};
	String[] wordlistThree= {"велосипед","плед","полёт","дела делишки","вертолёт"};
	int oneLength=wordlistOne.length;
	int twoLength=wordlistTwo.length;
	int threeLength=wordlistThree.length;
	int rand1=(int) (Math.random()*oneLength);
	int rand2=(int) (Math.random()*twoLength);
	int rand3=(int) (Math.random()*threeLength);
	String phrase=wordlistOne[rand1]+" "+wordlistTwo[rand2]+" "+wordlistThree[rand3];
	System.out.println("Всё что вам нужно - это "+phrase);
}
}
