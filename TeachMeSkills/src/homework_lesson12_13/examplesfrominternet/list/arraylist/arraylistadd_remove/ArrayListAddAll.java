package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylistadd_remove;
/*In this tutorial we will see the usage of addAll() method of java.util.ArrayList class. 
 *This method is used for adding all the elements of a list to the another list.*/
import java.util.ArrayList;

/*In this example we are adding two elements of an arraylist to another arraylist by using addAll() method*/
public class ArrayListAddAll {
public static void main(String[] args) {
	 ArrayList<String> al = new ArrayList<String>();
     al.add("Hi");
     al.add("hello");
     al.add("String");
     al.add("Test");
     System.out.println("ArrayList1 before addAll:"+al);

     //ArrayList2 of String Type
     ArrayList<String> al2 = new ArrayList<String>();
     al2.add("Text1");
     al2.add("Text2");
     al2.add("Text3");
     al2.add("Text4");

     //Adding ArrayList2 into ArrayList1
     al.addAll(al2);
     System.out.println("ArrayList1 after addAll:"+al);
     System.out.println("=======================");
/*Here we will see another variant add(int index, Collection c) which adds all the elements of c at the specified index of a list.
public boolean addAll(int index, Collection c)*/     
     // ArrayList1 
     ArrayList<String> al3 = new ArrayList<String>();
     al3.add("Apple");
     al3.add("Orange");
     al3.add("Grapes");
     al3.add("Mango");
     System.out.println("ArrayList1 before addAll:"+al3);

     //ArrayList2 
     ArrayList<String> al4 = new ArrayList<String>();
     al4.add("Fig");
     al4.add("Pear");
     al4.add("Banana");
     al4.add("Guava");
     System.out.println("ArrayList2 content:"+al4);

     //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
     al3.addAll(2, al4);
     System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al3);
     System.out.println("=======================");
}
}
