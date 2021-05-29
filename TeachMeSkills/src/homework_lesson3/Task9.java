package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Please insert positive number which will represent length of the array: ");
double a = sc.nextDouble();
	while ((a < 0) || (a % 1 != 0)) {
		System.out.print("You entered wrong number! Please enter correct number!: " );
		a = sc.nextDouble();
		
	}
int b = (int)a;	
int [] mass = new int[b];	
	for(int i=0; i<mass.length; i++) {
		mass[i] = r.nextInt(16);
	}
System.out.println("Generated array: ");	
for(int i=0; i<mass.length; i++) {
	System.out.print(mass[i] + " ");
	}
System.out.println();
if (mass.length % 2 !=0) {
	System.out.println("Since the array consists of an odd number of numbers, the boundary number will not be taken into account when calculating the sums of the halves");
	
}
//Если массив четный
int wholesum = 0;
int sumleft = 0;
int sumright = 0;

for(int i=0; i<mass.length; i++) {   //Верно для обоих
	wholesum += mass[i];
}

if (mass.length % 2 == 0) {
	for (int i = 0; i<mass.length/2; i++) { 	//Для четного массива
			sumleft += mass[i];
	}
			sumright = wholesum - sumleft;
			System.out.println("Sum of the left side is " + sumleft);
			System.out.println("Sum of the right side is " + sumright);
			if (sumleft>sumright) {
				System.out.println("Sum of the left side is bigger than sum of the right side ");
			} else { if(sumleft<sumright) {
				System.out.println("Sum of the right side is bigger than sum of the left side ");
			} else {
				System.out.println("Sums are equal");
			}
				
			}
} else {
		for(int i=0; i<mass.length/2; i++) {
			sumleft+=mass[i];
		}
				for(int j=mass.length-1; j>mass.length/2; j--) {
					sumright+=mass[j];
			}
			System.out.println("Sum of the left side is " + sumleft);
			System.out.println("Sum of the right side is " + sumright);
			if (sumleft>sumright) {
				System.out.println("Sum of the left side is bigger than sum of the right side ");
			} else { if(sumleft<sumright) {
				System.out.println("Sum of the right side is bigger than sum of the left side ");
			} else {
				System.out.println("Sums are equal");
			}
				
			}
		}


}
}
