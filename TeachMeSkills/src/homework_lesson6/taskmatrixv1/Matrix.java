package homework_lesson6.taskmatrixv1;
import java.lang.*;
import java.util.Arrays;
public class Matrix {
	
	private double [][] arr;
	private int numlines;
	private int numcolumns;
	private static int counter = 1;
	private static double [][] supparr;
		
		public Matrix(){
			
		}
		
		public Matrix (int numlines, int numcolumns) {
			this.numlines = numlines;
			this.numcolumns = numcolumns;
		}

			public int getNumlines() {
				return numlines;
			}
	
			public void setNumlines(int numlines) {
				this.numlines = numlines;
			}
	
			public int getNumcolumns() {
				return numcolumns;
			}
	
			public void setNumcolumns(int numcolumns) {
				this.numcolumns = numcolumns;
			}
		
				public void generateMatrix() {
					System.out.println("Матрица № " + counter);
					counter +=1;
					arr = new double [(int) numlines][(int) numcolumns];
						for (int i = 0; i < numlines; i++) {
							for (int j = 0; j < numcolumns; j++) {
								arr[i][j] = Math.random() * 10;
								System.out.printf("%3.1f  ", arr[i][j]);
							}
							System.out.println();
						}
				}
//				public static String matrixAddition(Matrix a, Matrix b) {
//					supparr = new double[a.numlines][a.numcolumns];
//					if ((a.numcolumns != b.numcolumns) || (a.numlines) != (b.numlines)) {
//						System.out.println("Складывать можно только матрицы с одинаковой размерностью!");
//					} else {
//						for (int i = 0;  i < a.numlines; i++) {
//							for (int j = 0; j < b.numcolumns; j++) {
//								supparr[i][j] = a.arr[i][j] + b.arr[i][j]; 
//							}
//						}
//					}
//					return "Итоговая матрица" + Arrays.deepToString(supparr); /*Возвращаем строковое предстввление двумерного массива*/ 
//				}
				public static double[][] matrixAddition(Matrix a, Matrix b) {
					supparr = new double[a.numlines][a.numcolumns];
					if ((a.numcolumns != b.numcolumns) || (a.numlines) != (b.numlines)) {
						System.out.println("Складывать можно только матрицы с одинаковой размерностью!");
					} else {
						for (int i = 0;  i < a.numlines; i++) {
							for (int j = 0; j < b.numcolumns; j++) {
								supparr[i][j] = a.arr[i][j] + b.arr[i][j]; 
							}
						}
					}
					return supparr; /*Возвращаем двумерный массив*/ 
				}
				/*В данном примере вообще ничего не возвращаем, а выводим результат в консоль прямо в методе*/
//				public static void matrixAddition(Matrix a, Matrix b) {
//					System.out.println("Итоговая матрица, полученная при сложении матриц");
//					supparr = new double[a.numlines][a.numcolumns];
//					if ((a.numcolumns != b.numcolumns) || (a.numlines) != (b.numlines)) {
//						System.out.println("Складывать можно только матрицы с одинаковой размерностью!");
//					} else {
//						for (int i = 0;  i < a.numlines; i++) {
//							for (int j = 0; j < b.numcolumns; j++) {
//								supparr[i][j] = a.arr[i][j] + b.arr[i][j]; 
//							}
//						}
//						for (int i = 0;  i < a.numlines; i++) {
//							for (int j = 0; j < b.numcolumns; j++) {
//								System.out.printf("%5.1f  ", supparr[i][j]);
//							}
//							System.out.println();
//						}
//					}
//				}
				public static void multiplicationByANumber(Matrix a, int b) {
					System.out.println("Итоговая матрица, полученная при умножении матрицы на число " + b);
					supparr = new double[a.numlines][a.numcolumns];
					for (int i = 0; i < a.numlines; i++) {
						for (int j = 0; j < a.numcolumns; j++) {
							supparr[i][j] = a.arr[i][j] * b;
						}
					}
					for (int i = 0; i < a.numlines; i++) {
						for (int j = 0; j < a.numcolumns; j++) {
							System.out.printf("%5.1f  ", supparr[i][j]);
						}
						System.out.println();
					}
				}
				public static void multiplicationByAMatrix(Matrix a, Matrix b) {
					int c = 0;
					int d = 0;
					if (a.numcolumns != b.numlines) {
						System.out.println("Две матрицы можно перемножить между собой тогда и только тогда, когда количество столбцов первой матрицы равно количеству строк второй матрицы.");
						return;
					} else {
						if (a.numlines > b.numlines) {
							 c = a.numlines;
					} else {
							 c = b.numlines;
					}
							if (a.numcolumns > b.numcolumns) {
								 d = a.numcolumns;
							} else {
								 d = b.numcolumns;
							}
							
					supparr = new double [c][d];
					for (int i = 0; i < c ; i++) {
						for (int j = 0; j <d ; j++) {
							supparr[i][j] = a.arr[i][0] * b.arr[0][j] + a.arr[i][1] * b.arr[1][j]; 
							}
						}
					System.out.println("Тест");
					for (int i = 0; i < c; i++) {
						for (int j = 0; j < d; j++) {
							System.out.printf("%5.1f  ", supparr[i][j]);
						}
						System.out.println();
						}
					}
				}
		
}
				
				
			
