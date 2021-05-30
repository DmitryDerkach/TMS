package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
public static void main(String[] args) {
	
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
int ari = 0;
int k = 0;
	for(int i = 1; i < mass.length;) {
		ari += mass[i];
		i = i + 2;
		k+=1;
	}
double arifinal = (double)ari / (double)k;	
System.out.print("Arithmetic mean of odd-numbered elements: " + arifinal);






}
}
