package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

/* Описание (2026): Создаёт массив введённой длины из случайных чисел от 0 до 9 и "сжимает" его: обнуляет все элементы с нечётными индексами, затем выводит результат. */
public class Task15 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Enter the number that will represent the length of the array: ");
int a = sc.nextInt();
int [] mass = new int[a];
sc.close();
	for(int i = 0; i < mass.length; i++) {
		mass[i] = r.nextInt(10);
	}
System.out.println("Generated array: ");
	for (int i = 0; i < mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.println();
//Let's squeeze the array	
System.out.println("Transformed array: ");	
	for(int i = 1; i < mass.length;) {
		mass[i] = 0;
		i+=2;
	}
	for (int i = 0; i < mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
}
}
