package homework_lesson6.taskmatrix;

public class MatrixApplication {
public static void main(String[] args) {
/*ВСЕ ОПЕРАЦИИЮ, ЧТО Я ОПИСАЛ В КЛАССЕ MATRIX РАБОТАЮТ ТОЛЬКО ДЛЯ ОДНОГО И ТОГО ЖЕ ЭЗЕМПЛЯРА КЛАССА!*/
Matrix test = new Matrix();
/*Создаем матрицу 3*3    */
test.setColumn(3);
test.setLine(3);
/*Генерируем нашу матрицу*/
test.createMatrix();
/*Генерируем еще одну рандомную матрицу того же размера, которая, как и первая останется в памяти нашего экземпляра класса*/
test.createMatrix();
/*Вызываем метод, показывающий нам матрицу под нужным нам порядковым номером*/
//test.displayMatrix(2);
/*Вызываем метод умножения на число*/	
//test.multiplicationBy(2);
/*Вызываем метод сложения матриц сохраненных в памяти экземпляра класса */
test.matrixPlusMatrix();	
	
	
	
	
	}

}
