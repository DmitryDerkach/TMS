package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*ArrayList internally implements growable dynamic array which means it can increase and decrease its size automatically. 
 *If we try to add an element to a already full ArrayList then it automatically re-sized internally to accommodate the new 
 *element however sometimes its not a good approach.
Consider a scenario when there is a need to add huge number of elements to an already full ArrayList, in such case ArrayList has to be 
resized several number of times which would result in a poor performance. For such scenarios ensureCapacity() method of 
Java.util.ArrayList class is very useful as it increases the size of the ArrayList by a specified capacity.

public void ensureCapacity(int minCapacity)*/
public class ArrayListSizeIncrease {
public static void main(String[] args) {
	 // ArrayList with Capacity 4
    ArrayList<String> al = new ArrayList<String>(4);
    //Added 4 elements
    al.add("Hi");
    al.add("Hello");
    al.add("Bye");
    al.add("GM");

    //Increase capacity to 5
    al.ensureCapacity(5);

    al.add("GE");
    // let us print all the elements available in list
    for (String temp: al) {
          System.out.println(temp);
    }
}
}
