package homework_lesson2;
//Напишите программу,  определяющую сумму всех нечетных чисел от 1 до 99
public class Task7 {
	public static void main(String[] args) {
		
		int sum = 0;
		int a = 1;
		while (a<=99) {
			sum = sum + a;
			a = a + 2;		
		}
		System.out.println("Cумма всех нечетных чисел от 1 до 99 равна " + sum);
	}
}
