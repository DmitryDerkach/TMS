package homework_lesson6.taskmatrix;
import java.util.Random;
public class Matrix {
	/*Поля*/
	private int column;
	private int line;
	private static int [][][] arrsup; /*Трехмерный массив, в который мы будем складывать двухмерные массивы для последующих вычислений*/
	private boolean trigger = false; /*Триггер для проверок*/
	private static int supnum = 1;/*Вспомогательное число, которым будем крутить ячейки трехмерного массива*/
	/*Методы*/
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	/*Создаем матрицу*/
	public void createMatrix() {
		trigger = true;
		arrsup = new int[100][][]; /*Создаем трехмерный массив, который будет хранить наш двумерный массив*/
		arrsup [supnum-1] = new int [line][column]; /*Создаем двумерный массив ячейки трехмерного массива размерностью line * column*/
		/*Заполняем матрицу рандомными значениями*/	
			Random r = new Random();
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					arrsup[supnum-1][i][j] = r.nextInt(11);
				}
			}
//		/*Выводим исходную матрицу на экран*/
		System.out.println("Матрица №" + supnum + ":"); 
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" %3d", arrsup[supnum-1] [i][j]);
			}
			System.out.println();
		}
		supnum += supnum; 
	}
	/*Метод, который будет выводить на экран ту матрицу, которая нам была нужна*/
	public void displayMatrix(int n) {
		System.out.println("Выводим на экран матрицу под номером " + n + ":");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" %3d", arrsup[n-1][i][j]);
			}
			System.out.println();
		}
	}
	
//	/*Умножение матрицы на число*/
//	public void multiplicationBy(int num) {
//		if (trigger == false) {
//			System.out.println("Вы не можете пользоваться операцией умножения, пока не сгенерируете матрицу!");
//			return;
//		}
//	/*Умножаем элементы матрицы на число num*/	
//			for (int i = 0; i < line; i++) {
//				for (int j = 0; j < column; j++) {
//					arrsup[supnum] = 
//				}
//			}
//	/*Выводим полученную матрицу на экран*/		
//			System.out.println("Матрица, умноженная на число " + num + ":");
//			for (int i = 0; i < line; i++) {
//				for (int j = 0; j < column; j++) {
//					System.out.printf(" %3d", arrsup[supnum-1] [i][j]);
//				}
//				System.out.println();
//			}
//	}
	/*Сложение матрицы с другой матрицей*/		
//	public void matrixplusmatrix(Matrix a, Matrix b) {
//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j< column; j++) {
//				int [][] arrresult = new int [line][column];
//				arrresult[i][j] = a[i][j] + b[i][j];
//				
//				
//			}
//		}
		
}

	
	
	
	

