package homework_lesson3;
/*Создайте массив из всех четных чисел от 2 до 20 и выведите элементы масисва на экран сначала в строку, отделяя один элемент от другого
 * пробелом, а затем в столбик(отделяя один жлемент от другого началом новой строки). Перед созданием массива подумайте , какого он будет размера*/

public class Task1 {
public static void main(String[] args) {

//Шаг 1. Создаем массив с двадцатью элементами
	int[] mass = new int[20];
//Шаг 2. Заполняем его значениями от 1 до 20
	mass[0] = 1;
	for(int i = 1; i<20; i++) {
		mass[i]  = mass[i-1] + 1;
	}
//Шаг 4.Проверка
	System.out.println("Array with 20 num-s");
	for(int i = 0; i<20; i++) {
		System.out.print(mass[i] + " ");
	}
//Все хорошо, идем дальше
//Шаг 5. Опередялем длинну будущего массива, в котором будут лежать четные числа: 20/2 = 10	
//Шаг 6. Задаем массив, в котором будут лежать четные числа
	int mass2[] = new int[10];
	int j = 0;
	for(int i = 0; i<20; i++) {
		if (mass[i] % 2 == 0) {
			mass2[j] = mass[i];
			j++;
		}
	}
	
	System.out.println();
//Шаг 7. Проверяем заполнение второго массива четными числами
	System.out.println("New array with evens only:");
	for(int i = 0; i<10; i++) {
		System.out.print(mass2[i] + " ");
	}
	System.out.println(" - Output in sting-view like");
	for(int i = 0; i<10; i++) {
		System.out.println(mass2[i]);
	}
		System.out.println("Output in column-view like");
	
	
	
}	
}
