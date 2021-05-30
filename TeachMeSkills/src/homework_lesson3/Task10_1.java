package homework_lesson3;
//Решение задачи №10 от Димы Поверова
import java.util.Random;
import java.util.Scanner;

public class Task10_1 {
public static void main(String[] args) {

	  int n;
      int evenCount = 0;

      Scanner sc = new Scanner(System.in);
      Random rand = new Random();

      System.out.print("Enter a number more than 3: ");

      n = sc.nextInt();

      while (n<4) {
          System.out.println("You've entered a wrong number");
          System.out.print("Reenter it: ");
          n = sc.nextInt();
      }
      sc.close();
      int[] arr1 = new int[n];

      for (int i=0; i<arr1.length; i++) {
          arr1[i] = rand.nextInt(n);       //Заполняем массив рандомными числами
          System.out.print(arr1[i] + " "); 
          if (arr1[i]%2 == 0 && arr1[i]!=0) {		//Определяем кол-во четных чисел
              evenCount++;
          }
      }

      System.out.println("\nIn the array even " + ((evenCount>1)? "numbers are " : "number is ") + evenCount);  //Использование тернарной операции

      int[] arr2 = new int [evenCount];

      for (int i=0, j=0; i<arr1.length; i++) {
          if (arr1[i]%2 == 0 && arr1[i]!=0) {
              arr2[j] = arr1[i];
              j++;
          }
      }

      for (int x: arr2) {							//Enchanced for loop
          System.out.print(x + " ");
      }

	
	
	
	
	
	
	
	
	
	
	
	
}
}
