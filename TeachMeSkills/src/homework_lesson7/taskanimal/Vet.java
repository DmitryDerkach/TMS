package homework_lesson7.taskanimal;
import homework_lesson7.taskanimal.Animal;
public class Vet {
	public static void treatAnimal (Animal animal) {
		System.out.println("Этот питомец ест " + animal.getFood()); /*food*/
		System.out.println("Этот питомец живет в " + animal.getLocation());/*location*/
	}
}
