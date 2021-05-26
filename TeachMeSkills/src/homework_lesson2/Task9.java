package homework_lesson2;
//Вывести треугольник №2
public class Task9 {
	public static void main(String[] args) {
		
		 for (int step = 0; step<=4; step++) {
			 
			 for (int space = 0;space != step;space++) {
				 System.out.print(" ");
			 }
			 
			 for (int star = 4; star != step; star--) {
				 System.out.print("*");
			 }
				
		
		System.out.println();
		 }
	
	
		}
}
