package homework_lesson6.taskmatrixv1;

public class MatrixApplication {
public static void main(String[] args) {

Matrix test = new Matrix(3,3);
Matrix test1 = new Matrix();
	test1.setNumlines(3);
	test1.setNumcolumns(3);
		test.generateMatrix();
		test1.generateMatrix();
			 System.out.println(Matrix.matrixAddition(test, test1));
			
		
	
	
	
	
	
	
	
	
	
}
}
