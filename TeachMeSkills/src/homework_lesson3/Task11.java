package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
public static void main(String[] args) {
//Creation of the array with n length and filling it with random num-s from 0 to 9
Scanner sc = new Scanner(System.in);
Random r = new Random();
System.out.print("Enter the lenght of the array: ");
int a = sc.nextInt();
System.out.print("Generated array: ");
int [] mass = new int[a];
	for(int i = 0; i <mass.length; i++) {
		mass[i] = r.nextInt(10);
		System.out.print(mass[i] + " ");
	}
System.out.println();
sc.close();
//
System.out.println("IMPORTANT INFORMATION");
System.out.println("In this particular case we won't recognize zero as a num that can divided by three");
int product = 1;
System.out.print("Nums that can divided by 3 are: ");
for (int i = 0; i < mass.length; i++) {
	if((mass[i] % 3 == 0) && (mass[i] != 0)){
		product *=mass[i];
		System.out.print(mass[i] + " ");
	}
}
System.out.println();
System.out.println("Product of num-s that can divided by 3 is: " + product);
}
}
