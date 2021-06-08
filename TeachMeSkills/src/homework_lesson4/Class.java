package homework_lesson4;
/*Информация по двумерным массивам*/
public class Class {
public static void main(String[] args) {
	
/*N-dimensional array 
 * int [][] arr = new int [][] --- [] - number of arrays. Ex: 
 * int [][] arr4 = {{1,2},{2,4},{5,7}}
 */
/*Пишу тестовую программу на двумерные массивы*/
int n = 10;	

int[][]array = new int [n][n];

array [1][1] = 1;
array [1][2] = 1;
array [1][3] = 1;

	for (int i = 0; i < n; i++ ) {
		for (int j = 0; j < n; j++) {
			System.out.print(array[i][j]);
		}
		System.out.println();
	}

	

	
}
}
