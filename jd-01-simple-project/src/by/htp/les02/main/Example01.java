package by.htp.les02.main;
import java.util.Arrays;
public class Example01 {


		 public static void main(String[] args) {
		        //����������� ������ � ������ char'��
		        String string = "abcdefg";
		        char[] chArray = string.toCharArray();
		        System.out.println("������ � ������ ��������: " + Arrays.toString(chArray));
		        //String � char
		        char xchar = string.charAt(2);
		        System.out.println("String � char: " + xchar);
		        
		        //char � String
		        String s = Character.toString(xchar);
		        System.out.println("char � String: " + s);
		        
		        //������� ������ 1 �� ������ 
		        System.out.println("������� ��� ������� '1' �� ������: " + removeSpecificCharsFromString("1A1B1C1D121D1", '1'));
		    }
		 
		    private static String removeSpecificCharsFromString(String str, char c) {
		        // ������� � ������ str ��� ������� c � �������� �� ��������� �������� "" 
		        return str.replaceAll(Character.toString(c), "");
		    }
		 
	}


