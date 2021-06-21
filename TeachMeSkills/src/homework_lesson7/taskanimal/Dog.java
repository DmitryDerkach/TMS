package homework_lesson7.taskanimal;

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
