package homework_lesson5.taskcomp;

import java.util.Random;
import java.util.Scanner;

public class Computer {

String Core;
 int RAM;
 int HDD;
 int resourse;
 boolean turn = true;
	 
 Computer(String a, int b, int c){
	 Core = a;
	 RAM = b;
	 HDD = c;
 }
 
 void displayInfo() {
	 System.out.printf("Проверка внесенных данных: \nCore: %s \nRAM: %d \nHDD: %d \n", Core, RAM, HDD);
 }
  
 void turnOn(){
	 System.out.println("Попытка включения компьютера. Введите число 0 или 1");
	 if (turn == false) {
		 System.out.println("Ваш компьютер больше не запустится. Он сгорел");
//			 break;  На этом моменте хочу прервать выполнение инструкций метода, но компилятор ругается
	 }
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
	 System.out.println("Компьютер включен. Хотите выключить его? Введите 1, если Да и 0, если нет");
	 int c = sc.nextInt();
	 if (c > 0) {			
//			 void turnOff;			//Как мне из одного метода перепрыгнуть в другой метод?
	 }
	 } else { System.out.println("Ваш компьютер сгорел. Ваш компьютер больше не запустится");
	 }
	 turn = false; 		//Как мне после заврешения работы какого-то метода вернуться к началу его выполнения? Т.е. как мне его зациклить?
//В данном случае, я хочу, чтобы после окончания метода turnOn он увидел в консоли сначала строку 42, а потом 44
 }
	  
 void turnOff(){
	 if (turn == false) {
		 System.out.println("Ваш компьютер не запустится");
	 }
	 System.out.println("Попытка выключения компьютера. Введите число от 0 или 1");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 sc.close();
	 Random r = new Random();
	 int b = r.nextInt(2);
	 if (b == a) {
	 System.out.println("Компьютер выключен");
	 } else { System.out.println("Ваш компьютер сгорел. Ваш компьютер больше не запустится"); 
	 }
	 turn = false; 
	 }
		
}
