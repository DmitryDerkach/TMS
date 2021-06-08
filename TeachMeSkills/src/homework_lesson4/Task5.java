package homework_lesson4;

import java.util.Random;
import java.util.Scanner;
/*Создать квадратную мартрицу, рамер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим в кон-
 *соль(в виде матрицы)*/
public class Task5 {
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
/*Транспонировать матрицу*/
/*Создадим доп. матрицу того же размера*/
int [][] arr2 = new int [a][a];
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			arr2[i][j] = arr [j][i];
		}
	}
System.out.println("Транспонированая матрица: ");
	for (int i = 0; i < a; i++) {
		for(int j = 0; j < a; j++) {
			System.out.printf("%3d  ", arr2[i][j]);
		}
		System.out.println();
	}	

}
}
