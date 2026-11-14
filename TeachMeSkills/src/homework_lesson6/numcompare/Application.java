package homework_lesson6.numcompare;
import java.util.*;
/* Описание (2026): Вывод последовательности целых чисел от A до B (по возрастанию или убыванию). Итеративный вариант со Scanner закомментирован, активный вариант вызывает рекурсивный Calc.getSequance(1, -2). */
public class Application {
public static void main(String[] args) {
/*Решение не перегруженное рекрсией*/	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter A number: ");
//	int a = sc.nextInt();
//	System.out.print("Enter B number: ");
//	int b = sc.nextInt();
//	sc.close();
//		if (a < b) {
//			System.out.println("Т.к. а < b, то числовая последовательность выглядит так: ");
//			for (int i = a; i <=b; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println("Т.к. а > b, то числовая последовательность выглядит так: ");
//			for (int i = a; i >= b; i--) {
//				System.out.print(i + " ");
//			}
//		}
/*Решение перегруженно рекурсией*/		
Calc.getSequance(1, -2);			
	}
}
