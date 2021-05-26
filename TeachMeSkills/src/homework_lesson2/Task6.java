package homework_lesson2;
//Напишите программу вывода всех четных чисел от 2 до 100 включительно.
public class Task6 {
	public static void main(String[] args) {
		int count = 2;
		int a = 0;
		
		do {
			System.out.printf("%d ",count);
			count = count + 2;
			a++;
				if (a % 10 == 0) {
				System.out.println();
				}
					
			} while (count<=100);
		
		}
}
