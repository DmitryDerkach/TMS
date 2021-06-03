package homework_lesson5.taskcomp;

import java.util.Random;
import java.util.Scanner;

public class Computer {									//Вынес в отдельный класс         
														//Название класса с большой буквы 
String сore;
 protected int ram;												//Наименование полей класса с маленькой буквы 
 protected int hdd;
 protected int resourse;
 
 private boolean live = true;
 private boolean boot = false; 
 //private int liveresourse = 5;
	 
 Computer(String a, int b, int c){
	 сore = a;
	 ram = b;
	 hdd = c;
 }
 
 Computer(){
	 
 }
 
 void displayInfo() {
	 
	 System.out.printf("Проверка внесенных данных: \nCore: %s \nRAM: %d \nHDD: %d \n", сore, ram, hdd);
 }
  
 void turnOn(){
	 boot = true;
	 System.out.println("Попытка включения компьютера. Введите число 0 или 1");
	 if (live == false) {								//Добавил оператор ветвления для проверки, сгорел компьютер или нет. Ненужный break убрал
		 System.out.println("Ваш компьютер больше не запустится. Он сгорел");
	 } else {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
		 System.out.println("Компьютер включен.Ресурс компьютера снижен на 1 Хотите выключить его? Введите 1, если Да и 0, если нет");
		 int c = sc.nextInt();
		 	if (c > 0) {			
		 		turnOff();			// Убрал void, поставил скобки
		 	} else {
		 		System.out.println("Компьютер находится в ждущем режиме.");
		 	}
	 	} else {
		 System.out.println("Ваш компьютер сгорел. Ваш компьютер больше не запустится");
		 live = false; 
		 }
		 do {
			 turnOn();
		 } while (live = true);		//Добавил цикл do-while
	 	
	 }             
 }
	  
 void turnOff(){
	 if (boot == false) {
		 System.out.println("Вы не можете выключить выключенный компьютер");
	 } else {
	 if (live == false) {
		 System.out.println("Ваш компьютер не запустится.");
	 }
	 System.out.println("Попытка выключения компьютера. Введите число от 0 или 1");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
		 System.out.println("Компьютер вылючен. Хотите включить его? Введите 1, если Да и 0, если нет");
		 int c = sc.nextInt();
		 	if (c > 0) {			
		 		turnOn();			
		 	} else {
		 		System.out.println("Компьютер выключен");
		 	}
	 	} else {
		 System.out.println("Ваш компьютер сгорел. Ваш компьютер больше не запустится");
		 live = false;
	 		}
	 	}	
	 }             
} //Скобка класса Computer
