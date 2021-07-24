package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*There are two ways to empty an ArrayList – By using ArrayList.clear() method or with the help of ArrayList.removeAll() method. 
 * Although both methods do the same task the way they empty the List is quite different.
Lets see the below example first then we will see the implementation and difference  between clear() and removeAll().*/
public class ArrayListClear {
public static void main(String[] args) {
	 ArrayList<String> al1=new ArrayList<String>();
     al1.add("abc");
     al1.add("xyz");

     System.out.println("ArrayList before clear: "+al1);
     al1.clear();
     System.out.println("ArrayList after clear: "+al1);

     ArrayList<String> al2=new ArrayList<String>();
     al2.add("text 1");
     al2.add("text 2");

     System.out.println("ArrayList before removeAll: "+al2);
     al2.removeAll(al2);
     System.out.println("ArrayList before removeAll: "+al2); 
     
     
}
}
