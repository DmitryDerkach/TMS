package homework_lesson3;
//This is solution for the Task #13.
import java.util.Random;
import java.util.Scanner;

public class Task14 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Enter the number that will represent the length of the array: ");
int a = sc.nextInt();
System.out.print("Enter the number C which we will use for comprassion: ");
int c = sc.nextInt();
int [] mass = new int[a];
sc.close();
	for(int i = 0; i < mass.length; i++) {
		mass[i] = r.nextInt(10);
	}
System.out.print("Generated array: ");
	for (int i = 0; i < mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
int low2 = 0;
	for (int i = 0; i < mass.length; i++){    //The biggest num in the array
		if (mass[i] >= low2){
			low2 = mass[i];                  
 		} 
  	}
System.out.println();
System.out.println("The biggest num in the array: " + low2);
	if (low2 >= c) {
		System.out.println("Because C is bigger or equal than the biggest num in the array we cannot find the arithmetic mean superior to C");
		return;
	}
double sum = 0;
double k = 1;
	step:for (int i = 0; i < mass.length; i++) {
		if (((sum+=mass[i]) / k) <= c) {
			k+=1;
		} else {
			System.out.println();
			System.out.printf("Arifmetic mean of %d " + (i+1>1?"elements " : "element ") + (i+1>1?"are " : "is ") + "bigger than %2$d",i+1,c);
			break step;
		}
		if (i  == mass.length - 1)	{
			System.out.println("In this particular case we can't find arifmetic mean that will satisfy the condition ");
		}
	}

}
}
