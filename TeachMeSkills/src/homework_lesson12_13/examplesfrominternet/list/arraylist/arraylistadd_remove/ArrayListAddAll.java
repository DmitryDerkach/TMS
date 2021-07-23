package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylistadd_remove;

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
}
}
