package homework_lesson7.taskanimal;

public class Cat extends Animal{
	public int mousecatchcount;
	
		public Cat(String food, String location, int mousecatchcount) {
			super(food, location);
			this.mousecatchcount = mousecatchcount;
		}
		
		public void makeNoise() {
			System.out.println("Кот мяукает");
		}
		public void eat() {
			System.out.println("Кот ест");
		}
}
