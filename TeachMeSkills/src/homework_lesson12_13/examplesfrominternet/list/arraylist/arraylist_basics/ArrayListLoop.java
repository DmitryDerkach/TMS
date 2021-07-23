package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/*There are 4 ways how to loop ArrayList:
 *For Loop;
 *Advanced for loop;
 *While loop;
 *Iterator. */
public class ArrayListLoop {
public static void main(String[] args) {
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(14);
	ar1.add(7);
	ar1.add(39);
	ar1.add(40);
	
	/*For loop for iterating ArrayList*/
	System.out.println("For loop:");
	for (int i = 0; i < ar1.size(); i++) {
		System.out.print(ar1.get(i) + " ");
	}
	System.out.println();
	System.out.println("====================");
	
	/*Advanced for loop*/
	System.out.println("Advanced for loop:");
	for (Integer i: ar1) {
		System.out.print(i + " ");
	}
	System.out.println();
	System.out.println("====================");
	
	/*While loop for iterating ArrayList*/
	System.out.println("While loop:");
	int i = 0;
	while (i < ar1.size()){
		System.out.print(ar1.get(i) + " ");
		i++;
	};
	System.out.println();
	System.out.println("====================");
	
	/*Looping ArrayList using Iterator*/
	System.out.println("Iterator");
	Iterator it1 = ar1.iterator(); /*Возвращает экземпляр класса Itr, имплементирующий интерфейс Iterator*/
	while (it1.hasNext()) {
		System.out.print(it1.next() + " ");
	}
	System.out.println();
	System.out.println("====================");
	
	/*Additional method of looping by using enumeration*/
	/*Creating an ArrayList object*/
	ArrayList<String> ar2 = new ArrayList<String>();
	/*Add elements to ArrayList*/
	ar2.add("C");
	ar2.add("C++");
	ar2.add("Java");
	ar2.add("DotNet");
	ar2.add("Perl");
	/*Get the Enumeration object*/
	Enumeration<String> e = Collections.enumeration(ar2); /*Возвращает экзмепляр анонимного класса, имплементирующего интерфейс Enumeration*/
	/*Enumerate through the ArrayList elements*/
	System.out.println("Enumeration:");
	while (e.hasMoreElements())
		System.out.print(e.nextElement() + " ");
	System.out.println();
	System.out.println("====================");
}
}
