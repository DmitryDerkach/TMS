package homework_lesson6.taskmatrix;
import java.util.Random;
public class Matrix {
	/*Поля*/
	private int column;
	private int line;
	private int [][] arr;
	private boolean trigger = false;
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
	public void createMatrix() {
		trigger = true;
		arr = new int [line][column];
		/*Заполняем матрицу рандомными значениями*/	
			Random r = new Random();
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					arr [i][j] = r.nextInt(11);
				}
			}
		/*Выводим исходную матрицу на экран*/
		System.out.println("Исходная матрица:");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" %3d", arr [i][j]);
			}
			System.out.println();
		}
	}
	/*Умножение матрицы на число*/
	public void multiplicationBy(int num) {
		if (trigger == false) {
			System.out.println("Вы не можете пользоваться операцией умножения, пока не сгенерируете матрицу!");
			return;
		}
	/*Умножаем элементы матрицы на число num*/	
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = num * arr[i][j];
				}
			}
	/*Выводим полученную матрицу на экран*/		
			System.out.println("Матрица, умноженная на число " + num + ":");
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					System.out.printf(" %3d", arr [i][j]);
				}
				System.out.println();
			}
	}
	
}
