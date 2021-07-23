package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_sorting;

import java.util.ArrayList;
import java.util.Collections;

/*In this tutorial we have shared the examples of sorting an String ArrayList and integer ArrayList*/
public class ArrayListSorting {
	public static void main(String[] args) {
/*Example 1: Sorting of ArrayList<String>*/
/*Here we are sorting the ArrayList of String type. 
 *We are doing it by simply calling the Collections.sort(arraylist) method. The output List will be sorted alphabetically.*/
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("India");
		al1.add("US");
		al1.add("China");
		al1.add("Denmark");
		/*Unsorted list*/
		System.out.println("Unsorted ArrayList:");
		{int i = 0;
		while (i < al1.size()) {
			System.out.print(al1.get(i) + " ");
			i++;
		}
		}
		System.out.println();
		System.out.println("================");
		/*Sort statement*/
		Collections.sort(al1);
		/*Sorted list*/
		System.out.println("Sorted ArrayList:");
		{int i = 0;
		while (i < al1.size()) {
			System.out.print(al1.get(i) + " ");
			i++;
		}
		}
		System.out.println();
		System.out.println("================");
/*Example 2: Sorting of ArrayList<Integer>*/
/*The same Collections.sort() method can be used for sorting the Integer ArrayList as well*/		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(11);
		al2.add(2);
		al2.add(7);
		al2.add(3);
		/*Unsorted list*/
		System.out.println("Unsorted ArrayList:");
		{int i = 0;
		while (i < al2.size()) {
			System.out.print(al2.get(i) + " ");
			i++;
		}
		}
		System.out.println();
		System.out.println("================");
		/*Sort statement*/
		Collections.sort(al2);
		/*Sorted list*/
		System.out.println("Sorted ArrayList:");
		{int i = 0;
		while (i < al2.size()) {
			System.out.print(al2.get(i) + " ");
			i++;
		}
		}
		System.out.println();
		System.out.println("================");
	}
}
