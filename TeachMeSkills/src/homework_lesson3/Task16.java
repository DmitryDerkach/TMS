package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
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
/*We do 2 cycles. The first one moves the numbers by indices from 0 to mass.length - 1, and the second loop compares the number under the selected 
 * index with all others numbers in an array*/
	for (int i = 0; i < mass.length; i++) {
		for (int j = mass.length-1; j >= 0;j--) {
			if (mass[i] != mass[j] || i == j) {
				continue;
			} 
			if (mass[i] == mass[j]) {
				System.out.println("The array contains the same elements");
				return;
			}

		}
	}
System.out.println("The array doesn't contain the same elements");
}
}
