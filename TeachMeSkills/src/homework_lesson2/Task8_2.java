package homework_lesson2;
//Практикум. Вывожу треугольник №1 по методу Никиты с 3-мя циклами
public class Task8_2 {
	public static void main(String[] args) {
		
		 for (int step = 1; step<=4; step++) {
			 for (int space = 0; (space + step) != 4; space++) {
				 System.out.print(" ");
			 }
			 
			 for (int star = 0; star != step; star++) {
			 
			 System.out.print("*");
		 }
			 System.out.println();
			 
		 }
//И все равно сделал как-то по своему, kekW. Главное, что через циклы
	}
}
