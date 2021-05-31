package homework_lesson3;
//bubble sorting from higher to lower
import java.util.Scanner;
import java.util.Random;

public class Additional1 {
public static void main(String[] args) {

System.out.print("Enter the number of the numbers in the array: ");
Scanner sc = new Scanner(System.in);
Random r = new Random();
int num = sc.nextInt();
int [] mass = new int [num];

	for(int i = 0; i<num; i++) {
	 mass[i] = r.nextInt(10);
	}
System.out.println("Unsorted massive: ");
	for(int i = 0; i<num; i++) {
		System.out.print(mass[i] + " ");
		}
System.out.println();
System.out.println("Massive sorting opperations: ");
	for (int i = 1; i<num; i++) {
		for(int j = 0; j<num-1; j++) {
			if (mass[j]<mass[j+1]) {
				int value = mass[j];
				mass[j] = mass[j+1];
				mass[j+1] = value;
			}
			
			for(int z = 0;z<num; z++) {
				System.out.print(mass[z] + " ");
			}
			System.out.print("     ");
		}
		System.out.println();	
	}
	
	System.out.println("Final result of bubble sorting from higher to lower: ");
	for(int j = 0;j<num; j++) {
		System.out.print(mass[j] + " ");
	}
sc.close();	
}
}
