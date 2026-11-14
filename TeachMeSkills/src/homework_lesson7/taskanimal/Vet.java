package homework_lesson7.taskanimal;
import homework_lesson7.taskanimal.Animal;
/* Описание (2026): Ветеринар: статический метод treatAnimal(Animal) принимает любое животное через ссылку базового типа и печатает его еду и место обитания. */
public class Vet {
	public static void treatAnimal (Animal animal) {
		System.out.println("Этот питомец ест " + animal.getFood()); /*food*/
		System.out.println("Этот питомец живет в " + animal.getLocation());/*location*/
	}
}
