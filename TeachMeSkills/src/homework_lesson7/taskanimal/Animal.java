package homework_lesson7.taskanimal;

/* Описание (2026): Абстрактный базовый класс животного для задачи "Ветеринар": общие поля food и location, абстрактные методы makeNoise() и eat(), общий метод sleep(). Наследники - Dog, Cat, Horse. */
public abstract class Animal {
	private String food;
	private String location;
		
		public Animal(String food, String location) {
			this.food = food;
			this.location = location;
		}

		public String getFood() {
			return food;
		}
		public void setFood(String food) {
			this.food = food;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public abstract void makeNoise();
		
		public abstract void eat();
		
		public void sleep() {
			System.out.println("Питомец спит");	
		}
		
}
