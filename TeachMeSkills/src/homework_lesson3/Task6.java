package homework_lesson3;

import java.util.Random;

public class Task6 {
public static void main(String[] args) {
 
Random r = new Random();
int [] mass = new int[4];
	for(int i = 0; i<mass.length; i++) {
		mass[i] = r.nextInt(11);
	}
System.out.println("Array:");
	for(int i = 0; i<mass.length; i++) {
	System.out.print(mass[i] + " ");
	}
System.out.println();
boolean prove = false;
	for(int i = 0; i<mass.length-1; i++) {
		if (mass[i]>mass[i+1]) {
			System.out.println("Array is NOT strictly ascending sequence");
			prove = true;
			break;
		} 
				
	}
	if (prove == false) {
		System.out.println("Array IS strictly ascending sequence");
	}

}
}
