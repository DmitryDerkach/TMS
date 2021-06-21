package homework_lesson7.taskanimal;

public class Horse extends Animal{
	private int maxspeed;
	
		public Horse(String food, String location, int maxspeed) {
			super(food, location);
			this.maxspeed = maxspeed;
		}
		
		public void makeNoise() {
			System.out.println("Лошадь ржет");
		}
		public void eat() {
			System.out.println("Лошадь ест");
		}
}
