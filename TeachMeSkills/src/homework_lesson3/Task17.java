package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task17 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Enter the number that will represent the length of the array: ");
int a = sc.nextInt();
int [] mass = new int[a];
	for(int i = 0; i < mass.length; i++) {
		mass[i] = r.nextInt(10);
	}
System.out.println("Generated array: ");
	for (int i = 0; i < mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.println();	
System.out.print("Choose particular number among all num-s in the array: ");
int part = sc.nextInt();
int numtimes = 0;
sc.close();
/*Compare the entered number index by index with each element of the array*/
	for(int i = 0; i < mass.length; i++) {
		if (mass[i] == part) {
			numtimes+=1;
		}
	}
System.out.println("This number occurs " + numtimes + (numtimes > 1? " times" : " time"));	




}
}
