package homework_lesson3;

import java.util.Random;

public class Task7 {
public static void main(String[] args) {

int[] mass = new int[12];
Random r = new Random();
	for (int i = 0; i<mass.length; i++) {
		mass[i] = r.nextInt(16);
	}

System.out.println("Array with lenght 12 contains nim-s from 0 to 15");
	for (int i = 0; i<mass.length; i++) {
		System.out.print(mass[i] + " ");
	}

System.out.println();	
//»щем наибольший элемент в массив
	int max = mass[0];
	for(int i = 0; i<mass.length; i++) {
		if (mass[i]>max) {
			max = mass[i];
		}
	}

System.out.print("The biggest number in the array is: " + max);
System.out.println();
System.out.print("The biggest number is placed on this spots: ");
	for(int i = 0; i < mass.length; i++) {
		if(max == mass[i]) {
			System.out.print( i + " ");
		}
		
	}
	

	
	
	
	
	
}
}
