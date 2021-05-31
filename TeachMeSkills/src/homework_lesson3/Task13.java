package homework_lesson3;
//This is solution for the Task #14.
import java.util.Random;
import java.util.Scanner;
public class Task13 {
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
//Let's find the lowest	odd number
System.out.println();
System.out.print("Lowest odd num is: ");
//System.out.println("The biggest number in the array is: ");
int low1 = 0;
int low2 = 0;
	for (int i = 0; i < mass.length; i++){    //The biggest element in the array
		if (mass[i] >= low2){
			low2 = mass[i];                  
 		} 
  	}
//System.out.print(low2);
	for (int i = 0; i< mass.length; i++) {
		step:if((mass[i] % 2 != 0) && (mass[i] != 0)){
			low1 = mass[i];
			if (low1 <= low2) {
				low2 = low1;
			} else {
				break step;
			}

			
		}
	}
System.out.print(low2);		
}		
}
