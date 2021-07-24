package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.util.ArrayList;

/*isEmpty() method of java.util.ArrayList class is used for checking whether the list is empty or not. 
 *This method returns a boolean value.

public boolean isEmpty()

It returns true if the list is empty otherwise it gives false.*/
public class ArrayListCheckEmptiness {
public static void main(String[] args) {
	 //ArrayList of Integer Type
    ArrayList<Integer> al = new ArrayList<Integer>();
    //Checking whether the list is empty
    System.out.println("Is ArrayList Empty: "+al.isEmpty());

    //Adding Integer elements
    al.add(1);
    al.add(88);
    al.add(9);
    al.add(17);

    //Again checking for isEmpty
    System.out.println("Is ArrayList Empty: "+al.isEmpty());

    //Displaying elements of the list
    for (Integer num: al) {
    System.out.println(num);
 }
}
}
