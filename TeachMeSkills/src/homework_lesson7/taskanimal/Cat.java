package homework_lesson7.taskanimal;

/* Описание (2026): Наследник Animal в задаче "Ветеринар": кошка с дополнительным полем mousecatchcount (число пойманных мышей), переопределяет makeNoise() и eat(). */
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
