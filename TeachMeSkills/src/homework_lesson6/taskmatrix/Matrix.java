package homework_lesson6.taskmatrix;
import java.util.Random;
import java.util.Scanner;
public class Matrix {
	/*Поля*/
	private int column;
	private int line;
	private int [][][] arrsup = new int[100][100][100]; /*Трехмерный массив, в который мы будем складывать двухмерные массивы для последующих вычислений*/
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
		arrsup [supnum-1] = new int [line][column]; 
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
	/*Метод, который будет выводить на экран матрицу под тем номером, который нам нужен*/
	public void displayMatrix(int n) {
		System.out.println("Выводим на экран матрицу под номером " + n + ":");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" %3d", arrsup[n-1][i][j]); /*Почему выскакивает NullPointerExeption?*/
			}
			System.out.println();
		}
	}
	
	/*Умножение матрицы на число*/
	public void multiplicationBy(int n) {
		if (trigger == false) {
			System.out.println("Вы не можете пользоваться операцией умножения, пока не сгенерируете матрицу!");
			return;
		}
	System.out.print("Введите номер порядковый номер квадратной матрицы (не индекс!), из сохраненных в памяти для данного экземпляра класса, \n"
			+ "на элементы которой будет производится умножение(исходная матрица будет перизаписана): ");
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt();
	sc.close();
		/*Умножаем элементы матрицы на число num*/	
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					arrsup[a-1][i][j] = arrsup[a-1][i][j] * n; 
				}
			}
	/*Выводим полученную матрицу на экран*/		
				System.out.println("Выводим на экран матрицу под номером " + a + ", умноженную, на число " + n);
				for (int i = 0; i < line; i++) {
					for (int j = 0; j < column; j++) {
						System.out.printf(" %3d", arrsup[a-1][i][j]); 
					}
					System.out.println();
				}
			}
	/*Сложение матрицы с другой матрицей*/		
	public void matrixPlusMatrix() {
	System.out.print("Введите номер порядковый номер квадратной матрицы (не индекс!), которая будет является первым слагаемым: ");
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt();
	System.out.print("Введите номер порядковый номер квадратной матрицы (не индекс!), которая будет является вторым слагаемым: ");
	int b = sc.nextInt();
	for (int i = 0; i < line; i++) {
		for (int j = 0; j < column; j++) {
			arrsup[99][i][j] = arrsup[a-1][i][j] + arrsup[b-1][i][j];	/*Почему эта строчка будет выбивать мне
			NullPointer если я проинициализирую массив не так, как сейчас, а, например, new int[100][line][column] */
		}
	
	}	
	System.out.println("Итоговая матрица перезаписывает двумерный массив под №100 из-за специфики программы): ");
	for (int i = 0; i < line; i++) {
		for (int j = 0; j < column; j++) {
			System.out.printf(" %3d", arrsup[99][i][j]);
			}
		System.out.println();
		}
}






}	
	
	
	

