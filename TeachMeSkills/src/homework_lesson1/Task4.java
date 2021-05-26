package homework_lesson1;
//ƒаны 3 целых числа. Ќайти количество положительных чисел в исходном наборе
public class Task4 {
	public static void main(String[] args) {
	int a = 0;
	int b = -7;
	int c = 0;
	int d;
	int e;
	int f;
	int g;
	if (a>0) {
		d = 1;
}
	else {
		d = 0;
}
		if (b>0) {
		e = 1;
}
		else {
        e = 0;
}
			if (c>0) {
		f = 1;
}
			else {
		f = 0;		
}
	g = d + e + f;
	System.out.println((" оличество положительных чисел в наборе равно") + " " + g);
}
}
