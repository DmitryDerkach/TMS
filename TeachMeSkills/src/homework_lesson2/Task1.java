package homework_lesson2;
//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый 
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой 
//суммарный путь пробежит спортсмен за 7 дней?
public class Task1 {
	public static void main(String[] args) {
		 double distance = 10;
		 double percentage = 0.1;
		 double sum = 10;
		 for (int d=2; d<8; d++) {
			 distance = distance + distance * percentage;
			 sum = sum + distance;
		 }
		 System.out.printf("Total distance %1$5.2f", sum);			
	}	
}
