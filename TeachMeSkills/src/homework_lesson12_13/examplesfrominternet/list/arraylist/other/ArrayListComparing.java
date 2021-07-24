package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*In this tutorial we will learn how to compare two ArrayList. We would be using contains() method for comparing two elements of 
 *different ArrayList.

public boolean contains(Object o)
It returns true if the list contains the Object o else it returns false.

Example:
In this example we have two ArrayList al1 and al2 of String type. We have compared these ArrayLists using contains() method and stored 
the comparison result in third ArrayList (al3 and al4).*/
public class ArrayListComparing {
 public static void main(String[] args) {
	 ArrayList<String> al1 = new ArrayList<String>();
	 al1.add("hi");
     al1.add("How are you");
     al1.add("Good Morning");
     al1.add("bye");
     al1.add("Good night");

     ArrayList<String> al2= new ArrayList<String>();
     al2.add("Howdy");
     al2.add("Good Evening");
     al2.add("bye");
     al2.add("Good night");
     //Storing the comparsion output in ArrayList<String>
     ArrayList<String> al3 = new ArrayList<String>();
     for (String temp: al1) {
    	 al3.add(al2.contains(temp) ? "Yes": "No");
     }
     System.out.println(al3);
     
     
     
 }
}
