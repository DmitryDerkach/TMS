package homework_lesson6.numcompare;

/* Описание (2026): Вспомогательный класс к задаче numcompare: статический метод getSequance рекурсивно печатает все числа от a до b, шагая на +1 или -1 в зависимости от того, какое число больше. */
public class Calc {
	public static void getSequance(int a, int b) {
		if ((a < b) || (a == b)){
				if (a == b) {
					System.out.println(a);
					return ;
				}
				System.out.println(a);
				getSequance(a + 1, b);
			}
		if (a == b) {
			System.out.println("Числа равны, что противоречит условию!");
			return;
		}
		if ((a > b) || (a == b)) {
				if (a == b) {
					System.out.println(a);
					return ;
				}
				System.out.println(a);
				getSequance(a-1, b);
			}
	}		
}		

