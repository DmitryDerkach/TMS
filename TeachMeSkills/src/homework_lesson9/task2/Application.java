package homework_lesson9.task2;
/*Заменить все вхождения символа стоящего на позиции 3 на символ, стоящий на позиции 0*/
import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Введите строку, с которой будем работать: ");
	String a = sc.next();
	sc.close();
	char [] arr = a.toCharArray();
	System.out.print("Символ, стоящий на позиции 3 (начинаем счет с 0): " + arr[3] + "\n");
	System.out.print("Символ, стоящий на позиции 0: " + arr[0] + "\n");
	System.out.println("Заменим все вхождения символа, стоящего на позиции 3 на символ, стоящий на позции 0: ");
		for (int i = 0; i < arr.length; i++) {
		char sup = arr[3];	
			if (arr[i] == sup) {
				arr[i] = arr[0];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
}
}
