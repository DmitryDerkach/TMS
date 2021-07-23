package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_basics;
/*In the last post we discussed about class ArrayList in Java and it’s important methods. 
 *Here we are sharing multiple ways to initialize an ArrayList with examples.*/
import java.util.*;
public class ArrayListBasic2Initialization {
/*Method 1: Initialization using Arrays.asList*/
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>(
				Arrays.asList("Dima", "Petya", "Vasya"));
		System.out.println("Elements are:" + al1);
		System.out.println("=========================");
/*Method 2: Anonymous inner class method to initializate Arraylist*/
		ArrayList<String> al2 = null;
		new ArrayList(){ /*Создаем анонимный класс, который расширяет класс ArrayList. В блоке инициализации 
		добавляем объекты в нашу коллекцию*/
			{
				add("Delhi");
				//al2.add ("Agra");
				add ("Minsk");
				al1.add("RandomCity");
			}	
		};
		System.out.println("Content of ArrayList cities: " + al2);
		System.out.println("Elements of al collection are:" + al1);
/*Method 3: Normal way of ArrayList initialization*/
		ArrayList<String> al3 = new ArrayList<String>();
			al3.add("Hello");
			al3.add("Me name is Dima");
			System.out.println(al3);
/*Metho 4: Use Collections.ncopies
 *Collections.ncopies method can be used when we neeed to initializate the ArrayList with the same value for all of its elements. Syntax:
 *count ois number of elements and element is the item value
 *ArrayList<T> obj = new ArrayList<T>(Collections.ncopies(count, element));
 *Example: */
		ArrayList<Integer> al4 = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("al4 items:" + al4);
	}	
}
