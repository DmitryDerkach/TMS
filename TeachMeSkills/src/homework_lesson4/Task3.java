package homework_lesson4;
/*Создать квадратную мартрицу, рамер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим в кон-
 *соль(в виде матрицы)*/
import java.util.Random;
import java.util.Scanner;

public class Task3 {
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
/*Проверить, произведение элементов какой диагонали больше*/
System.out.println("Сравним произвидение элементов главной и побочной диагоналей");
int maindiag = 1;
int sidediag = 1;
/*Вычисляем произвидение на главной диагонали*/
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			if (i == j) {
				maindiag *= arr[i][j];
			}
		}
	}
/*Вычисляем произвидение на побочной диагонали*/
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			if (i + j == a - 1) {
				sidediag *= arr [i][j];
			}
		}
	}
	if (maindiag > sidediag) {
		System.out.println("Произвидение элементов на главной диагнали больше");
	}	else {
			if (maindiag < sidediag) {
				System.out.println("Произвидение элементов на побочной диагонали больше");
			}	else {
				System.out.println("Произвидение элементов на обоих диагоналях равно");
			}
	}

}
}
