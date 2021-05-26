package homework_lesson1;
//Дано целое число. Если оно является положительным, то прибавить к нему 1. Если отрицательным, то вычесть из него 2.
//Если нулевым, то заменить его на 10. Вывксти полученное число.
public class Task3 {
	public static void main(String[] args) {
		int a = 0;
		int b;
		if (a>0) {
			b = a + 1;
			System.out.println(b);
}
		else { 
			if (a<0) {
			b = a - 2;
			System.out.println(b);
}
			else {
			System.out.println("10");	
}
}

}
}
