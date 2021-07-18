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
		ArrayList<String> al2 = new ArrayList() { /*Создаем анонимный класс, который расширяет класс ArrayList. В блоке инициализации 
		добавляем объекты в нашу коллекцию*/
			{
				add("Delhi");
				//al2.add ("Agra");
				add ("Minsk");
			}	
		};
		System.out.println("Content of ArrayList cities: " + al2);
		
	}
}
