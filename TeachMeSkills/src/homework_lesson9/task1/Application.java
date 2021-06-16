package homework_lesson9.task1;
/*Вырезать подстроку из сторки, начиная с первого вхождения символа "А" до последнего вхождения символа "В"*/
import java.util.*;

public class Application {
public static void main(String[] args) {
	
//String test = "HelloWorld";
//System.out.println(test.indexOf("W"));
//System.out.println(test.lastIndexOf("d"));
//System.out.println(test.substring(5, 10));

/*Advanced version*/
	Scanner sc = new Scanner(System.in);
	System.out.print("Введите строку, с которой будем работать: ");
	String a = sc.next();
	System.out.print("Введите индекс первого вхождения символа (А): ");
	String b = sc.next();
	System.out.print("Введите индекс последнего вхождения символа (B): ");
	String c = sc.next();
	sc.close();
	char B = b.charAt(0);
	char C = c.charAt(0);
	
	
	System.out.println("Выводим подстроку от символа <<А>>, до символа <<В>> (включительно): ");
	char [] arr = a.toCharArray();
	int supnum = 0;
	int supnum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != B) {
				continue;
			} 
			if (arr[i] == B) {			/*Находим индекс первого вхождения???*/
				supnum = i;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != C) {
				continue;
			} 
			if (arr[i] == C) {			/*Находим индекс первого вхождения???*/
				supnum2 = i;
				break;
			}
		}
		for (int i  = supnum; i <= supnum2; i++) {
			System.out.print(arr[i]);
		}	
}
}
