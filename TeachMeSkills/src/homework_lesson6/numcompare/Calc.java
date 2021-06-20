package homework_lesson6.numcompare;

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

