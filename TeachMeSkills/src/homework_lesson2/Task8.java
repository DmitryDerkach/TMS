package homework_lesson2;
//Вывести на экран треугольник №1, состоящий из звездочек.
//Решение, до которого дошел сам
public class Task8 {
public static void main(String[] args){
		
		int star = 1;
		int balance = 0;
		
		for (int space = 1; space<4;space++) {
			balance = star + space;
			if (balance <= 4) {
				System.out.print(" ");
			}
				 if (balance > 4) {

					 System.out.println("****");
					 break;
					 
				 } else {
					 
					 if (balance==4){
				
						 switch (star) {
						 case (1):
							 	System.out.println("*");
						 		break;
						 case (2):
							 	System.out.println("**");
						 	break;
						 case (3):
							 	System.out.println("***");
						 	break;
						 }
						star = star + 1;
						space = 0;
						balance = 0;
						 
					 				}
					
					 
}
									
}	

		
}
}
