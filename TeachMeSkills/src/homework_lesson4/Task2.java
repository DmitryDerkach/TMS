package homework_lesson4;
/*Создать квадратную мартрицу, рамер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим в кон-
 *соль(в виде матрицы)*/
import java.util.Random;
import java.util.Scanner;

public class Task2 {
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
			arr[i][j] = r.nextInt(51);
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
/*Вывести нечетные элементы находящиеся под главной диагональю(не включая элементы главной диагонали)*/	
System.out.print("Нечетные элементы находящиеся под главной диагональю НЕ включая элементы главной диагонали: ");		
	for (int i = 1; i < a; i++) {
		for (int j = 0; j < a; j++) {
			if ((i + j < i+i) && (arr[i][j] % 2 != 0)) {
			System.out.print(arr[i][j] + " ");
		}
		}
	}	
System.out.println();
System.out.print("Нечетные элементы находящиеся под главной диагональю ВКЛЮЧАЯ элементы главной диагонали: ");		
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			if ((i + j <= i+i) && (arr[i][j] % 2 != 0)) {
			System.out.print(arr[i][j] + " ");
		}
		}
	}
		
	
	
	

	
}
}
