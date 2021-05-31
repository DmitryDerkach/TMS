package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task18 {
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
//Checking
int secondmax = 0;	
System.out.println("Max number: " + max);
	for (int i = 0; i < mass.length; i++) {		
			if((mass[i] > secondmax) && (mass[i] < max)) {
			secondmax = mass[i];	
			}
	}
System.out.print("The number following the maximum is: " + secondmax);	
	
}
}
