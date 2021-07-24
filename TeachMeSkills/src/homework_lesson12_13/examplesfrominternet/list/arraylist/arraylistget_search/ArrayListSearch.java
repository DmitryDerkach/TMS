package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylistget_search;

import java.util.ArrayList;
import java.util.List;

/*In this tutorial we will see how to get a sublist from an existing ArrayList.
 *We will be doing it using the subList method of ArrayList class.*/
public class ArrayListSearch {
public static void main(String[] args) {
/*Points to Note in the below example:
The subList method returns a list therefore to store the sublist in another ArrayList we must need to type cast the returned value in 
same way as I did in the below example. On the other side if we are storing the returned sublist into a list then there is no need to 
type cast (Refer the example).*/	
	ArrayList<String> al = new ArrayList<String>();

    //Addition of elements in ArrayList
    al.add("Steve");
    al.add("Justin");
    al.add("Ajeet");
    al.add("John");
    al.add("Arnold");
    al.add("Chaitanya");

    System.out.println("Original ArrayList Content: "+al);
    /*Sublist to ArrayList*/
    ArrayList<String> sal = new ArrayList<String>(al.subList(1, 4)); /*Нужно кастить, так как возвращается List, а не ArrayList */
    //ArrayList<String> salV2 = (al.subList(1, 4)); Ошибка преобразования
    System.out.println("SubList stored in ArrayList: "+sal);
    //Sublist to List
    List<String> list = al.subList(1, 4);
    System.out.println("SubList stored in List: "+list);
}
}
