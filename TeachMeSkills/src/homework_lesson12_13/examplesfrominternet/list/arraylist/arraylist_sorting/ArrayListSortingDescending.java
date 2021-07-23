package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*We are using Collections.reverseOrder() method along with Collections.sort() in order to sort the list in decreasing order. 
 *In the below example we have used the following statement for sorting in reverse order.
Collections.sort(arraylist, Collections.reverseOrder());
However the reverse order sorting can also be done as following – This way the list will be sorted in ascending order first and then it 
will be reversed.
Collections.sort(list);
Collections.reverse(list);
Example:*/
public class ArrayListSortingDescending {
public static void main(String[] args) {
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("AA");
	al1.add("ZZ");
	al1.add("CC");
	al1.add("FF");
	System.out.println("ArrayList before sorting:");
	for (String s: al1) {
		System.out.print(s + " ");
	}
	System.out.println();
	System.out.println("===============");
	/*Sorting in descending order*/
	Collections.sort(al1, Collections.reverseOrder());
	/*Or*/
//	Collections.sort(al1);
//	Collections.reverse(al1);	
	System.out.println("ArrayList in descending order:");
	Iterator itr = al1.iterator();
	while (itr.hasNext() == true) {
		System.out.print(itr.next() + " ");
	}
	
}
}
