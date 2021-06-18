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
				public static String matrixAddition(Matrix a, Matrix b) {
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
					return "Итоговая матрица" + Arrays.toString(supparr);  
				}
				/*Рабочая версия*/
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

				
}
