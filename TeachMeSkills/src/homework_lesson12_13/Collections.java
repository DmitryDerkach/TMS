package homework_lesson12_13;
/*Коллекции*/
import java.util.*;
public class Collections /*implements Collection<E> - можно чекнуть методы*/{
	public static void main(String[] args) {
		/*
		 * Классы коллекций располагаются в пакете java.util, поэтому перед применением
		 * коллекций следует подключить данный пакет. В основне всех коллекций лежит
		 * применение того или иного итнтерфейса, который определяет базовый функционал.
		 * Популярные коллекции: ArrayList LinkedList ArrayDeque Hashset TreeSet
		 * LinkerHashSet PriorityOueue HashMap TreeMap
		 * 
		 * Интерейс Collection является базыовым для всех коллекций (кроме TreeMap),
		 * определяя основной функционал. Данный интерфейс явялется обощенным и
		 * расширяет интерфейс iterable, поэтому все объекты коллекций можно перебирать
		 * по типу for-each
		 *  			!!Чекай конспект на предмет методов тех или иных интерфейсов!!
		 */
		
		/*Пример использования List*/
		List <String> people = new ArrayList<>();
		people.add("Tom");
		people.add("Alice");
		people.add("Kate");
		people.add("Sam");
		people.add(1, "Bob");
		System.out.println(people.get(1));
		people.add(1, "Robert");
		System.out.println("Size of ArratList collection: " + people.size());
			for (String p: people) {
				System.out.println(p);
			}
		/*Проверка на наличие в коллекции*/
		for (int i = 0; i < people.size(); i++) {	
			if (people.get(i) != null) {
				System.out.println("ArrayList contains " + people.get(i));
			}
		}
		/*Или*/
		if (people.contains("Tom")) {
			System.out.println("ArrayList contains Tom");
		}
		/*Удаление*/
		people.remove("Robert");
		people.remove(0);
		Object[] array = people.toArray();
		for (Object person: array) {
			System.out.println(person);
		}
		
	}
}
