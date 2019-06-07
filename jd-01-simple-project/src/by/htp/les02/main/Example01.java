package by.htp.les02.main;
import java.util.Arrays;
public class Example01 {


		 public static void main(String[] args) {
		        //Преобразуем строку в массив char'ов
		        String string = "abcdefg";
		        char[] chArray = string.toCharArray();
		        System.out.println("Строку в массив символов: " + Arrays.toString(chArray));
		        //String в char
		        char xchar = string.charAt(2);
		        System.out.println("String в char: " + xchar);
		        
		        //char в String
		        String s = Character.toString(xchar);
		        System.out.println("char в String: " + s);
		        
		        //удаляем символ 1 со строки 
		        System.out.println("удаляем все символы '1' со строки: " + removeSpecificCharsFromString("1A1B1C1D121D1", '1'));
		    }
		 
		    private static String removeSpecificCharsFromString(String str, char c) {
		        // находим в строке str все символы c и заменяем на строковую заглушку "" 
		        return str.replaceAll(Character.toString(c), "");
		    }
		 
	}


