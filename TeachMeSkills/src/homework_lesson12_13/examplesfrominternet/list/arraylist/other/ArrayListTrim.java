package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*trimToSize() method is used for memory optimization. It trims the capacity of ArrayList to the current list size. 
 *For e.g. An arraylist is having capacity of 15 but there are only 5 elements in it, calling trimToSize() method on this ArrayList 
 *would change the capacity from 15 to 5.
public void trimToSize()

Example
Here I have defined the ArrayList of capacity 50. After adding 10 elements I called trimToSize() method which would have reduced 
the capacity from 50 to 10 (current size of arraylist).*/
public class ArrayListTrim {
public static void main(String[] args) {
	 ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
	    arraylist.add(1);
	    arraylist.add(2);
	    arraylist.add(3);
	    arraylist.add(4);
	    arraylist.add(5);
	    arraylist.add(6);
	    arraylist.add(7);
	    arraylist.add(1);
	    arraylist.add(1);
	    arraylist.add(1);
	    arraylist.trimToSize();
	    //arraylist.get(33); После трима ловим АутОфБаунс, что логично
	    System.out.println(arraylist);
}
}
