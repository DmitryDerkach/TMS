package homework_lesson9.task2;
/*Заменить все вхождения символа стоящего на позиции 3 на символ, стоящий на позиции 0*/
import java.util.Scanner;

public class Application {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Введите строку, с которой будем работать: ");
//	String a = sc.nextLine();
//	sc.close();
//	char [] arr = a.toCharArray();
//	System.out.print("Символ, стоящий на позиции 3 (начинаем счет с 0): " + arr[3] + "\n");
//	System.out.print("Символ, стоящий на позиции 0: " + arr[0] + "\n");
//	System.out.println("Заменим все вхождения символа, стоящего на позиции 3 на символ, стоящий на позции 0: ");
//	char replacethis = arr[3];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == replacethis) {
//				arr[i] = arr[0];
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
/*Через StringBuilder*/		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку, с которой будем работать: ");
		String a = sc.nextLine();
		sc.close();
		char [] arr = a.toCharArray();
		System.out.print("Символ, стоящий на позиции 3 (начинаем счет с 0): " + arr[3] + "\n");
		System.out.print("Символ, стоящий на позиции 0: " + arr[0] + "\n");
		System.out.println("Заменим все вхождения символа, стоящего на позиции 3 на символ, стоящий на позции 0: ");	
		StringBuilder strb1 = new StringBuilder(a);
		char replace = arr[3]; /*Нельзя менять длинну*/
			for(int i = 0; i < arr.length; i++) {
				if (arr[i] == replace) {
					strb1.delete(i,i+1);
					//System.out.println(strb1); Для проверки
					strb1.insert(i, arr[0]);
					//System.out.println(strb1); Для проверки
				}
			}
}
}
