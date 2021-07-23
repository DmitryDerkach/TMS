package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_basics;

import java.util.ArrayList;

/*By using size() method of ArrayList class we can easily determine the size of the ArrayList. This method returns the number of 
 *elements of ArrayList
 *Example: */
public class ArrayListLenght {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(1);
	al1.add(13);
	al1.add(45);
	al1.add(44);
	al1.add(99);
	System.out.println("Size of ArrayList: " + al1.size());
	al1.remove(1);
	al1.remove(2);
	System.out.println("Size of ArrayList: " + al1.size());
	System.out.println("Final ArrayList:");
	for (int i = 0; i < al1.size(); i++) {
		System.out.print(al1.get(i) + " ");
	}
}
}
