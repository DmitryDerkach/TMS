package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task19 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Enter the number that will represent the length of the array: ");
int a = sc.nextInt();
int [] mass = new int[a];
sc.close();
	for(int i = 0; i < mass.length; i++) {
		mass[i] = r.nextInt(10);
	}
System.out.println("Generated array: ");
	for (int i = 0; i < mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.print(" ");
int max = 0;
	for (int i = 0; i < mass.length; i++) {
		if(mass[i] > max) {
			max = mass[i];
		}
	}
int min = max;
	for (int i = 0; i < mass.length;) {
		if (mass[i] < min) {
			min = mass[i];
		}
		i+=2;
	}
System.out.println("Let's show the indexes: ");	
for (int i = 0; i < mass.length; i++){
	System.out.print(i + " ");
}
System.out.println(" Smallest element among even-indexed elements: " + min);	
}
}
