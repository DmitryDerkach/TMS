package homework_lesson6.taskmatrix;

public class MatrixApplication {
public static void main(String[] args) {
	
Matrix test = new Matrix();
/*Создаем матрицу 3*3*/
test.setColumn(4);
test.setLine(3);
/*Генерируем нашу матрицу*/
test.createMatrix();
/*Вызываем метод умножения на число*/	
//test.multiplicationBy(2);	

Matrix test1 = new Matrix();
test1.setColumn(4);
test1.setLine(3);
test1.createMatrix();	
	
	
	
	
	
	
	}

}
