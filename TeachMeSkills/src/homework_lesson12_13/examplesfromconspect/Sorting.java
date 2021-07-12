package homework_lesson12_13.examplesfromconspect;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorting {
public static void main(String[] args) {
		/* Инеtрфейс Comparator */
		/*
		 * Метод compare так же возвращает числовое pначение. Если оно отрицательное,
		 * то объект а предшествует объекту b и наоборот. А если метод возвращает 0,
		 * то объекты равны. Для применения этого интерфейса нам вначале надо создать
		 * класс компаратора, который реалиpует этот интерфейс
		 */
	 
/* *** */
	PersonComparator pcomp = new PersonComparator();
	TreeSet<Person> people = new TreeSet<Person>(pcomp);
	people.add(new Person("Tom"));
	people.add(new Person("Nick"));
	people.add(new Person("Alice"));
	people.add(new Person("Bill"));
	for (Person p: people) {
		System.out.println(p.getName());
	}
	
}
/*Берется класс Person, который я уже создавал в этом пакете, в частности в HashSet*/
static class PersonComparator implements Comparator<Person>{
	public int compare (Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}/*Используем класс компаратора для создания объекта TreeSet*/
//PersonComparator pcomp = new PersonComparator();
//TreeSet<Person> people = new TreeSet<Person>(pcomp);
/*
 * Для создания TreeSet здесь используется одна из версий конструктора, котораая
 * в качестве параметра принимает компаратор. Теперь вне зависимости от того,
 * реалитзован ли в классе Person интерфейс Comparable, логика сравнения и
 * сортировки будет исспользована та, которая определена в классе компаратора
 */
/*---> *** */
}
