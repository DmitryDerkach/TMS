package homework_lesson6.taskmatrixv1;

public class MatrixApplication {
public static void main(String[] args) {

Matrix test1 = new Matrix(3,2);
Matrix test2 = new Matrix();
	test2.setNumlines(2);
	test2.setNumcolumns(3);
		test1.generateMatrix();
		test2.generateMatrix();
			/*System.out.println(Matrix.matrixAddition(test1, test2)); /*Вернули строкове представление двумерного массива (Раскоментировать со
			 *строки 49)*/ 
		    /*double [][] test;							
		    test = Matrix.matrixAddition(test1, test2);			//Вернули наш двумерный массив (не в виде строки) и вывели его на экран
		    System.out.println("Результат сложения матриц");
		    	for (int i = 0; i < test1.getNumlines(); i++) {
		    		for (int j = 0; j < test1.getNumcolumns(); j++) {
		    			System.out.printf("%3.1f  ", test[i][j]);
		    		}
		    		System.out.println();
		    	}*/
		    //Matrix.multiplicationByANumber(test1, 2); /*--- Умножение выбранной матрицы на число*/
		    Matrix.multiplicationByAMatrix(test1, test2); /*Умножение матриц (работает правильно)*/
		    
			
		
	
	
	
	
	
	
	
	
	
}
}
