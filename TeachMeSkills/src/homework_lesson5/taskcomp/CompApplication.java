package homework_lesson5.taskcomp;

import java.util.Random;
import java.util.Scanner;

/* Описание (2026): Точка входа задачи "Компьютер": создаёт объект Computer с заданными характеристиками, выводит их и запускает попытку включения. */
public class CompApplication {
public static void main(String[] args) {
	
Computer pc = new Computer("AMD", 16, 500, 2);
pc.displayInfo();
//pc.turnOff();
pc.turnOn();


}
}
