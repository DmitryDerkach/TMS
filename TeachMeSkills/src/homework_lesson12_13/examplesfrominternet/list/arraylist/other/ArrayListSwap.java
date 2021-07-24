package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;
import java.util.Collections;

/*This tutorial will help you understand how to swap two elements in an ArrayList. We are using Collections.swap() method for swapping.

public static void swap(List list, int i1, int i2)

This method swaps the element of index i1 with the element of index i2. It throws IndexOutOfBoundsException – 
if either i1 or i2 is less than zero or greater than the size of the list (i1 < 0 || i1 >= list.size() || i2 < 0 || i2 >= list.size()).*/
public class ArrayListSwap {
	public static void main(String[] args) {
/*In this example we have a ArrayList<String> and we are swapping 2nd (index =1) and 
 *5th (index=4) element of ArrayList using Collections.swap() method.*/		
		 ArrayList<String> al = new ArrayList<String>();
		    al.add("Sachin");
		    al.add("Rahul");
		    al.add("Saurav");
		    al.add("Sunil");
		    al.add("Kapil");
		    al.add("Vinod");

		    System.out.println("ArrayList before Swap:");
		    for(String temp: al){
		        System.out.println(temp);
		    }

		    //Swapping 2nd(index 1) element with the 5th(index 4) element
		    Collections.swap(al, 1, 4);

		    System.out.println("ArrayList after swap:");
		    for(String temp: al){
		       System.out.println(temp);
		    }
		
	}
}