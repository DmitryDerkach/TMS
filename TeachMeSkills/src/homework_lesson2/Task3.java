package homework_lesson2;
//Вычислить 1+2+4+8+...+256.
public class Task3 {
	public static void main(String[] args) {
		int sum = 0;
		int finalnumber=1;
		
		while (finalnumber<=256) {
			sum = sum + finalnumber;
			finalnumber = finalnumber * 2;
		}
		System.out.println(sum);
	}
}
