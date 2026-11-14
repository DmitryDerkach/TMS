package homework_lesson7.taskanimal;

/* Описание (2026): Наследник Animal в задаче "Ветеринар": собака с дополнительным полем numofwoncompetition (число выигранных соревнований), переопределяет makeNoise() и eat(). */
public class Dog extends Animal {
	private int numofwoncompetition;
	
		public Dog(String food, String location, int numofwoncompetition) {
			super(food, location);
			this.numofwoncompetition = numofwoncompetition;
		}
		
		public void makeNoise() {
			System.out.println("Собака гавкает");
		}
		public void eat() {
			System.out.println("Собака ест");
		}
		
}
