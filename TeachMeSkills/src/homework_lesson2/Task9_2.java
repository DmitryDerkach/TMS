package homework_lesson2;
//Вывести треугольник №2(через операторы ветвления)
public class Task9_2 {
	public static void main(String[] args) {
		
		
		
		int balance = 4;
		int star=4;
		for(int space = 0; space + star == balance; space++) {
				if (star == 0) {
					break;
				}
			
				if (balance == 4) {
					
					switch (star) {
					case 4:{
						System.out.print("****");
						break;
					}
					case 3:{
						System.out.print(" ***");
						break;
					}
					case 2:{
						System.out.print("  **");
						break;
					}
					case 1:{
						System.out.print("   *");
						break;
					}
						
					}
					System.out.println();
					star = star - 1;
				}
			
		}
		
		
		
		
	}
}
