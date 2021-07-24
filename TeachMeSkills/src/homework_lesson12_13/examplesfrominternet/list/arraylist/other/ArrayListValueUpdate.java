package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*If there is a need to update the list element based on the index then set method of ArrayList class can be used. 
 *The method set(int index, Element E) updates the element of specified index with the given element E.

public E set(int index, Element E)

Example:
In this example I have an ArrayList of Integer Type where I have added few elements and then I’m updating few of 
elements using set method of java.util.ArrayList class.*/
public class ArrayListValueUpdate {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(){
			
			{
				add(1);
			 	add(2);
			 	add(3);
			 	add(4);
			}
		};
		System.out.println(al1);
		al1.set(0, 11);
		al1.set(1, 22);
		al1.set(2, 33);
		al1.set(3, 44);
		System.out.println(al1);
		
		
	}
}
