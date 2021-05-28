package homework_lesson3;
/**/
import java.util.Random;

public class Task5 {
public static void main(String[] args) {

int [] mass1 = new int[5];
int [] mass2 = new int[5];

Random r = new Random();
	
	for (int i = 0; i<mass1.length; i++) {
	mass1[i] = r.nextInt(16);
	}
	for (int i = 0; i<mass2.length; i++) {
		mass2[i] = r.nextInt(16);
	}
	
System.out.println("Array #1: ");

	for (int i = 0; i<mass1.length; i++) {
		System.out.print(mass1[i] + " ");
	}
System.out.println();	
System.out.println("Array #2: ");	
	for (int i = 0; i<mass2.length; i++) {
		System.out.print(mass2[i] + " ");
	}
	
System.out.println();	
float average1 = 0;
float average2 = 0;

	for (int i = 0; i<mass1.length; i++) {
		average1 += mass1[i];
	}
	for (int i = 0; i<mass2.length; i++) {
		average2 += mass2[i];
	}
average1 = (average1/mass1.length);
average2 = (average2/mass2.length);
System.out.println("Average #1: " + average1);
System.out.println("Average #2: " + average2);

if(average1>average2) {
	System.out.println("Average ariphmetical for the first array is bigger");
}
if(average2>average1) {
	System.out.println("Average ariphmetical for the second array is bigger");
}
if(average1==average2) {
	System.out.println("Average ariphmetical for the first and the second array is equal");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
