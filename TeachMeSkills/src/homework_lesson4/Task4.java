package homework_lesson4;

import java.util.Random;
import java.util.Scanner;
/*Создать квадратную мартрицу, рамер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим в кон-
 *соль(в виде матрицы)*/
public class Task4 {
public static void main(String[] args) {
/*Начало общей части*/
System.out.print("Выбирите размер квадратной матрицы: ");
Scanner sc = new Scanner(System.in);
Random r = new Random();
int a = sc.nextInt();
sc.close();
int [][] arr = new int [a][a];
	for (int i = 0; i < a; i++) {
		for(int j = 0; j < a; j++) {
			arr[i][j] = r.nextInt(11);
		}
	}	
System.out.println("Наша квадратная матрица: ");
	for (int i = 0; i < a; i++) {
		for(int j = 0; j < a; j++) {
			System.out.printf("%3d  ", arr[i][j]);
		}
		System.out.println();
	}
/*Конец общей части*/
/*Подсчитать сумму четных элементов стоящих над побочной диагональю (не включительно)*/
System.out.print("Сумма четных элементов стоящих над побочной диагональю равна: ");	
int sum = 0;
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			if ((i+j < a-1) && (arr [i][j] % 2 == 0)) {
				sum += arr[i][j];
			}
		}
	}
System.out.print(sum);
}
}
