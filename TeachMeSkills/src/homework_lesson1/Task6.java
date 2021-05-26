package homework_lesson1;
//Даны 2 числа. Вывести большее из них.
public class Task6 {
	public static void main(String[] args) {
		int a = 2;
		int b = -13;
		if (a>b){
			System.out.println(a);
		}
		else {
			if (a<b) {
				System.out.println(b);
			}
			else {
				System.out.println("Числа равны между собой");
			}
		}
	}
}
