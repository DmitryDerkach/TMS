package homework_lesson5.taskcomp;

import java.util.Random;
import java.util.Scanner;

public class Computer {									//Вынес в отдельный класс         
														//Название класса с большой буквы 
String сore;
 protected int ram;												//Наименование полей класса с маленькой буквы 
 protected int hdd;
 protected int resourse;
 
 private boolean conditioncheck = true;
 private boolean boot = false; 
//private int liveresourse = 5;
//private int on;
//private int off;
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
	 System.out.println("Попытка включения компьютера");
	 if (conditioncheck == false) {						
		 System.out.println("Ваш компьютер больше не запустится. Он сгорел");
	 } else {
	 System.out.println("Введите число 0 или 1");	 
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
		 System.out.println("Компьютер включен. Хотите выключить его? Введите 1, если <<Да>> и 0, если <<Нет>>");
		 int c = sc.nextInt();
		 	if (c > 0) {			
		 		turnOff();			
		 	} else {
		 		System.out.println("Компьютер находится в ждущем режиме");
		 	}
	 	} else {
		 System.out.println("Ваш компьютер сгорел");
		 conditioncheck = false; 
		 sc.hasNext();
			 if (sc.hasNext() == true) {
				 turnOn();
			 }
		 }
	 }             
 }
	  
 void turnOff(){
	 if (boot == false) {
		 System.out.println("Вы не можете выключить выключенный компьютер");
	 } else {
	 System.out.println("Попытка выключения компьютера. Введите число от 0 или 1");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
		 System.out.println("Компьютер выключен. Хотите включить его? Введите 1, если <<Да>> и 0, если <<Нет>>");
		 int c = sc.nextInt();
		 	if (c > 0) {			
		 		turnOn();			
		 	} else {
		 		System.out.println("Компьютер выключен");
		 	}
	 	} else {
		 System.out.println("Ваш компьютер сгорел. Ваш компьютер больше не запустится");
		 conditioncheck = false;
	 		}
	 	}	
	 }             
} //Скобка класса Computer
