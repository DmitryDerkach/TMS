package homework_lesson12_13.examplesfromconspect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample {
	public static void main(String[] args) {
		/*Пример использования List*/
		List <String> people = new ArrayList<>();
		/*Добавим в список ряд элементов*/
		people.add("Tom");
		people.add("Alice");
		people.add("Kate");
		people.add("Sam");
		/*Добавляем элемент по идексу 1*/
		people.add(1, "Bob");
		System.out.println(people.get(1));
		System.out.println("=================================");
		/*Посмотрим на нашу коллекцию. Том так и остался на нулевой позиции, Боб встал на первую, а Алиса сместилась с первой позиции на 
		 *вторую*/
		for (String p: people) {
			System.out.println(p);
		}
		System.out.println("=================================");
		/*Добавим еще один элемент в нашу коллекцию*/
		people.add(1, "Robert");
		System.out.println("Size of ArratList collection: " + people.size());
		System.out.println("=================================");
		/*Отобразим обновленную коллекцию*/
			for (String p: people) {
				System.out.println(p);
			}
		System.out.println("=================================");
		/*Проверка на наличие в коллекции*/
		for (int i = 0; i < people.size(); i++) {	
			if (people.get(i) != null) {
				System.out.println("ArrayList contains " + people.get(i));
			}
		}
		System.out.println("=================================");
		/*Или*/
		if (people.contains("Tom")) {
			System.out.println("ArrayList contains Tom");
		}
		System.out.println("=================================");
		/*Удаление конкретно элемента из коллекции по индексу и по наименованию*/
		people.remove("Robert");
		people.remove(0);
		Object[] array = people.toArray();
		for (Object person: array) {
			System.out.println(person);
		}
		System.out.println("=================================");
	}
}
