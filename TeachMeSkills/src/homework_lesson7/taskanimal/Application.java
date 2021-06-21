package homework_lesson7.taskanimal;

public class Application {
public static void main(String[] args) {
	Animal Dog = new Dog("Собачий корм", "Вольер", 3);
	Animal Cat = new Cat("Кошачий корм", "Жилой дом", 5);
	Animal Horse = new Horse("Сено", "Стойло", 70);
	/*Проверка методов*/
//	Dog.eat();
//	Cat.eat();
//	Horse.eat();
//		Dog.makeNoise();
//		Cat.makeNoise();
//		Horse.makeNoise();
//			Dog.sleep();
//			Cat.sleep();
//			Horse.sleep();	
	Animal [] animals = {Dog, Cat, Horse};
		for (int i = 0; i < animals.length; i++) {
			Vet.treatAnimal(animals[i]);
		}

	
	
	
	
}
}
