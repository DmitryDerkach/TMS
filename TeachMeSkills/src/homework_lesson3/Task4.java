package homework_lesson3;
/* Создайте массив из 20 случайных целых чисел из отрезка от 0 до 20 включительно. Выведите массив на экран в строку. Замените каждый элемент с не-
 * четным индексом на 0. Снова выведите массив на экран в отдельной строке*/
import java.util.Random;
public class Task4 {
public static void main(String[] args) {

Random r = new Random();	
int[] mass = new int[20];
	for(int i = 0; i<mass.length; i++) {
		mass[i] = r.nextInt(21);
	}
System.out.println("Array with length 20 which contains num-s from 0 to 20: ");
	for(int i = 0; i<mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.println();
System.out.print("Let's change all odd num-s to zero: ");
for (int i = 1; i<mass.length;) {
	mass[i] = 0;
	i+=2;
}
System.out.println();
	for(int i = 0; i<mass.length; i++) {
	System.out.print(mass[i] + " ");
}
	
}
}
