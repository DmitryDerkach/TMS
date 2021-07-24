package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*In this tutorial we will learn how to clone an ArrayList to another one. We would be using clone() method of ArrayList class 
 *to serve our purpose.
Object clone()
This method returns a shallow copy of the ArrayList instance.

Complete example of ArrayList Cloning
In this example we have an ArrayList of String type and we are cloning it to another ArrayList using clone() method. 
The interesting point to see here is when we added and removed few elements from original ArrayList after the clone() method, 
the cloned ArrayList didn’t get affected. It shows that clone() method just returns a shallow copy of ArrayList.*/
public class ArrayListClone {
public static void main(String[] args) {
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("Hello.");
	al1.add("My");
	al1.add("name");
	al1.add("is ");
	al1.add("Dima");
	System.out.println("ArrayList: "+al1);
	
	ArrayList<String> al2 = (ArrayList<String>)al1.clone();
	System.out.println("Shallow copy of ArrayList: "+ al2);
	
	al1.add("1");
	al1.remove("Hello.");
	
	System.out.println("Original ArrayList:"+al1);
    System.out.println("Cloned ArrayList:"+al2);
     
     
	
}
}
