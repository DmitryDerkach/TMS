package homework_lesson9.task1;
/*Вырезать подстроку из сторки, начиная с первого вхождения символа "А" до последнего вхождения символа "В"*/
import java.util.*;

public class Application {
public static void main(String[] args) {
/*Test Example*/	
String test = "HelloWorld";
test.indexOf("W");
test.lastIndexOf("d");
System.out.println(test.substring(5, 10));

/*Advanced version*/
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Введите строку, с которой будем работать: ");
//	String a = sc.nextLine();
//	System.out.print("Введите символ (А): ");
//	String b = sc.next();
//	System.out.print("Введите символ (B): ");
//	String c = sc.next();
//	sc.close();
//	char B = b.charAt(0);
//	char C = c.charAt(0);
//	System.out.println("Вырезаем подстроку из сторки, начиная с первого вхождения символа " +
//			  "А" + " до последнего вхождения символа" + " В");
//	char [] arr = a.toCharArray();
//	int supnum = 0;
//	int supnum2 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != B) {
//				continue;
//			} 
//			if (arr[i] == B) {			/*Находим индекс первого вхождения A*/
//				supnum = i;
//				break;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != C) {
//				continue;
//			} 
//			if (arr[i] == C) {			/*Находим индекс последнего вхождения B*/
//				supnum2 = i;
//				continue;
//			}
//		}
//		for (int i  = supnum; i <= supnum2; i++) {
//			System.out.print(arr[i]);
//		}	
/*C использованием StrinBuilder*/	
Scanner sc1 = new Scanner(System.in);  
System.out.print("Введите строку, с которой будем работать: ");
String supstring1 = sc1.nextLine();
char [] arrsup = supstring1.toCharArray();
System.out.print("Введите символ (А): ");
String b2 = sc1.next();
System.out.print("Введите символ (B): ");
String c2 = sc1.next();
int supnumv1 = 0;
int supnumv2 = 0;
	for (int i = 0; i < arrsup.length; i++) {
		if (arrsup[i] == b2.charAt(0)) {
			supnumv1 = i;
			break;
		} else {
			continue;
		}
	}
	for (int i = 0; i < arrsup.length; i++) {
		if (arrsup[i] == c2.charAt(0)) {
			supnumv2 = i;
			continue;
		} else {
			continue;
		}
	}
StringBuilder sb1 = new StringBuilder(supstring1);	
String str1 = sb1.substring(supnumv1,supnumv2 + 1/*Зависит от того, хочу ли я, чтобы включался символ B или нет*/);
System.out.println(str1);		
}
}
