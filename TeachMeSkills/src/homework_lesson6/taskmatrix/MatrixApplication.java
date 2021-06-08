package homework_lesson6.taskmatrix;

public class MatrixApplication {
public static void main(String[] args) {
	
Matrix test = new Matrix();
/*Создаем матрицу 3*3*/
test.setColumn(4);
test.setLine(3);
/*Генерируем нашу матрицу*/
test.createMatrix();
/*Вызываем метод усножения на число*/	
test.multiplicationBy(2);	

	
	
	
	
	
	
	
	
	}

}
