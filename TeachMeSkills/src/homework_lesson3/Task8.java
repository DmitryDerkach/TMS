package homework_lesson3;

import java.util.Random;

public class Task8 {
public static void main(String[] args) {

int[] mass = new int[10];
Random r = new Random();
	for (int i = 0; i<mass.length; i++) {
		mass[i] = r.nextInt(10);
	}

int[] mass2 = new int[10];
	for (int i = 0; i<mass2.length; i++) {
		mass2[i] = r.nextInt(10);
	}

double[] mass3 = new double[10];
System.out.println("IMPOTANT INFORMATION!!!");
System.out.println("if the second array will contain 0 we will replace them with num. 1 because we can't divide by 0");
	for (int i = 0; i<mass.length; i++) {
		if (mass2[i] == 0) {
		mass2[i] = 1;	
		} 
		mass3[i] = (double)mass[i] / (double)mass2[i];
		
	}
System.out.print("First array: ");
	for (int i = 0; i<mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.println();

System.out.print("Second array: ");
	for (int i = 0; i<mass2.length; i++) {
		System.out.print(mass2[i] + " ");
	}
System.out.println();

System.out.print("Third array: ");
	for (int i = 0; i<mass3.length; i++) {
		System.out.printf("%.2f  ",mass3[i]);
	}
System.out.println();

int sum = 0;
System.out.print("Numbers of integer elements in array 3: ");
	for (int i = 0; i<mass3.length; i++) {
		if (mass3[i] % 1 == 0) {
			sum+=1;
		}
	}
System.out.println(sum);	















	
}
}
