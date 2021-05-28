package homework_lesson3;
// Примеры из класса
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Class {
public static void main(String[] args) {
/*Когда мы вызываем Сканнер, например nextInt, то мы вводим цифру 4 и нажимаем Enter. Так вот 4 - это цифра, это наш Int, но нужно
 * помнить, что при нажатии на кнопку Enter он тоже записывается в наш буффер (Т.е. в буффер ушло и 4 и Enter, где Enter - это
 * каретка и пустая строка). Так вот если я после этого вызываю метод nextLine, то он обращается к тому же самому буферу, а в нем
 * методом nextInt забралась только 4-ка, но в буффере осталась еще пустая строка, т.е. мое нажатие клавиши Enter. Так вот, если
 * в буффере что-то есть, то метод nextLine() достанет это что-то оттуда. Поэтому, если я хочу чтобы в метод nextLine автоматически 
 * не записывалась пустая строка, мне нужно сначала после метода nextInt(); вызвать метод nextLine(); В итоге он заберет из
 * буффера эту пустую строку, а потом уже вызвать Сканнер next(); или Сканнер nextLine(); Разница между ними только в том, что если
 * ты вызываешь Сканнер next();,то он считает с твоего консольного ввода только тут часть, которая идет до первого пробела.
 * Ex: Hello World и нажмешь Enter, то в твою переменную уйдет только слово Hello, а в буффере останется еще слово World, т.е. оно
 * может попасть в мой следующий вызов моего сканнера.
 * Метод сканнер клоус
 * Все потоки открытия и закрытия надо закрывать. Чтобы явно сказать программе, что мне больше не надо ничего оттуда (из буффера?
 * из консоли) ничего читать, ты вызывешь Scanner Close
   */

//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age: "); 
//  int a = sc.nextInt(); //После ввода  в буффер ушла цифра и Enter
//  System.out.print("Type your name: "); 
//  String line  = sc.nextLine(); //Обращаемся к буфферу и берем оттуда пустую строку
//  System.out.println(a);
//  System.out.println(line);//Выводим пустую строку
  
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age: "); 
//  int a = sc.nextInt(); //После ввода  в буффер ушла цифра и Enter
//  System.out.print("Type your name: "); 
//  sc.nextLine(); //Забираем из буффера пустую строку
//  String line  = sc.nextLine(); //В буффере ничего нет, записанное в консоль отправится в буффер
//  System.out.println(a);
//  System.out.println(line);//Выводим введенную фразу
//  sc.close(); //Закрываем поток ввода

//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age ");
//  int a = sc.nextInt();
//  sc.nextLine();
//  System.out.print("Type your name ");
//  String line = sc.nextLine();
//  System.out.println(a);
//  System.out.println(line);
//  sc.close();  //
//  System.out.println("Close...");
//  String line2 = sc.nextLine(); //Не работает после Scanner Close
//  System.out.println(line2);	
	
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type number: ");
//  int a = sc.nextInt();
//  Random random = new Random(); //Вводим класс рандом, не забывая его импортировать из библиотеки
//
//  while (a>0){
//      int r = random.nextInt(90) + 10; //  Возвращает следующее случайное числовое значение типа int в пределах от О до n
//      System.out.print(r + " ");
//      a--;	
//  }
	
// Проверка на налчие правльно введенного символа	
	
//Scanner sc = new Scanner(System.in);
//System.out.println("Введите целое число: ");
//if (sc.hasNextInt()) {
//int a = sc.nextInt();
//System.out.println("Вы ввели " + a);
//} else {
//System.out.println("Вы ввели не целое число");
//}
		
//	Эксперементы
//	System.out.println("Введите фразу: ");
//	Scanner sc = new Scanner(System.in);
//	String a = sc.nextLine(); //По идее в буффер отправляется фраза. Enter не отправляется 
//	String b = sc.nextLine();//Требует ввода еще одной фразы №2
//	System.out.println(a); //Выводим фразу
//	System.out.println(b);//Выводим фразу №2

/*Массивы*/

Scanner sc = new Scanner(System.in); // Создаемм объект типа Сканнер
Random r = new Random();// Создаем объект типа Random
System.out.println("Длинна массива:");
int n = sc.nextInt(); //Вводим длинну массива с клавиатуры
int mass[] = new int[n]; // Создаем массив длинной n
for (int i=0; i<mass.length; i++) {
	mass[i] = r.nextInt(9);// Заполняем массив случайными числами от 0 до 9 
}
System.out.println("Массив без изменений:");
for (int i = 0; i<mass.length; i++) {
System.out.print(mass[i] + " "); //Выводим массив на экран
}
System.out.println();
int min = mass[0];
int max = mass[0];
for (int i = 0; i<mass.length; i++) {
	if(mass[i]<min) {									//Находим максимальное и минимальное значения в массиве
		min = mass[i];
	}
	if(mass[i]>max) {
		max = mass[i];
	}
}
System.out.println("max = " + max + " min = " + min);  //Сортировка пузырьком
System.out.println("Сортировка пузырьком:");
for (int i = mass.length-1; i>0;i--) {
	for (int j = 0; j<i; j++) {
		if(mass[j]<mass[j+1]) {
		int value = mass[j];
		mass[j] = mass[j+1];
		mass[j+1] = value;
		}
	}
}
for (int i = 0; i<mass.length; i++) {
	System.out.print(mass[i] + " ");
}

System.out.println();

Arrays.sort(mass);										
System.out.println("Отсротированный по возрастанию");		//Автоматическая сортитровка массива по возрастанию
for (int i = 0; i<n; i++) {
	System.out.print(mass[i] + " ");
}
System.out.println();
	
Arrays.sort(mass);											//Реверс int массива
reverse(mass);
System.out.println("Отсортированный по убыванию");
for (int i = 0; i<n; i++) {
	System.out.print(mass[i] + " ");
}


} //Воид реверс вставляем ЗА мейном, но В классе
public static void reverse(int[] input) 
{ int last = input.length - 1; 
int middle = input.length / 2; 
for (int i = 0; i <= middle; i++) { 
	int temp = input[i]; input[i] = input[last - i]; input[last - i] = temp; 

}
}




}
