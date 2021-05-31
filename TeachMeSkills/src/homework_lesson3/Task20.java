package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
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
System.out.println();
int max = 0;
	for (int i = 0; i < mass.length; i++) {
		if(mass[i] > max) {
			max = mass[i];
		}
	}
System.out.println("The biggest num in the array: " + max);
System.out.println("Let's change zero index element to with our max element: ");


	for (int i = 0; i < mass.length; i++) {
		if (mass[i] == max) {
			mass[i] = mass[0];
		}
	}
mass[0] = max;
System.out.print(mass[0] + " ");
for (int i = 1; i < mass.length; i++) {
	System.out.print(mass[i] + " ");
}

}
}
