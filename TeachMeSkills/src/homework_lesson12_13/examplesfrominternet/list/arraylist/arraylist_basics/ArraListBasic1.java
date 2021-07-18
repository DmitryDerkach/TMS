package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_basics;

import java.util.ArrayList;
import java.util.Collections;
/*ArrayList is a resizable-array implementation of the List interface. It implements all optional list operations, 
 *and permits all elements, including null*/
/*Why ArrayList is better than Array?*/
/*The limitation with array is that it has a fixed length so if it is full you cannot add any more elements to it, 
 *likewise if there are number of elements gets removed from it the memory consumption would be the same as it doesn’t shrink.
 *On the other ArrayList can dynamically grow and shrink after addition and removal of elements. 
 *Apart from these benefits, ArrayList class enables us to use predefined methods of it which makes our task easy. */
public class ArraListBasic1 {
	public static void main(String[] args) {
/*How to create an ArrayList?
We can create an ArrayList by writing a simple statement like this:
This statement creates an ArrayList with the name alist with type “String”. 
The type determines which type of elements the list will have. Since this list is of “String” type, 
the elements that are going to be added to this list will be of type “String”.*/
	ArrayList<String> alist=new ArrayList<String>();
/*Similarly we can create ArrayList that accepts int elements.*/
		//ArrayList<Integer> list=new ArrayList<Integer>();
/*How to add elements to an ArrayList?
We add elements to an ArrayList by using add() method, this method has couple of variations, which we can use based on the requirement. 
For example: If we want to add the element at the end of the List then simply do it like this:*/	
		//alist.add("Steve"); //This will add "Steve" at the end of List
	/*Забавно. Если прописать эту строчку при отсутсвущем методе main - выдает кучу ошибок. Разобраться, почему, как появится время*/
/*To add the element at the specified location in ArrayList, we can specify the index in the add method like this:*/	
		//alist.add(3, "Steve"); //This will add "Steve" at the fourth position
	/*ВАЖНОЕ ПРИМЕЧАНИЕ: нельзя добавлять элемент в ячейки, которых пока нет. Т.е. можешь провалится в метод добавления по индексу и увидишь
	 *метод проверки rangeCheckForAdd() */
	/*Lets write the complete code:*/
	  alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
      //displaying elements
      System.out.println(alist);
      System.out.println("========================");
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
      System.out.println("========================");
/*Note: Since the index starts with 0, index 3 would represent fourth position not 3.*/	
/*Change an element in ArrayList
We can use the set method to change an element in ArrayList. We provide the index and new element, 
this method then updates the element present at the given index with the new given element. In the following example, 
we have given the index as 0 and new element as “Lucy” in the set() method, 
so the method updated the element present at the index 0 (which is the first element “Jim” in this example) with the new String element
 “Lucy”, which we can see in the output.*/	
      ArrayList<String> names = new ArrayList<String>();
      names.add("Jim");
      names.add("Jack");
      names.add("Ajeet");
      names.add("Chaitanya");
      names.set(0, "Lucy");
      System.out.println(names);
      System.out.println("========================");
/*How to remove elements from ArrayList?
We use remove() method to remove elements from an ArrayList, Same as add() method, this method also has few variations.

For example:*/	
      System.out.println("Removing examples:");
      ArrayList<String> alistv2=new ArrayList<String>(); 
      alistv2.add("Steve");
      alistv2.add("Tim");
      alistv2.add("Lucy");
      alistv2.add("Pat");
      alistv2.add("Angela");
      alistv2.add("Tom");

      //displaying elements
      System.out.println(alistv2);
      System.out.println("========================");
      //Removing "Steve" and "Angela"
      alistv2.remove("Steve");
      alistv2.remove("Angela");

      //displaying elements
      System.out.println(alistv2);
      System.out.println("========================");
      //Removing 3rd element
      alistv2.remove(2);

      //displaying elements
      System.out.println(alistv2);
      System.out.println("========================");
/*Iterating ArrayList
In the above examples, we have displayed the ArrayList elements just by referring the ArrayList instance, 
which is definitely not the right way to displays the elements. The correct way of displaying the elements is by 
using an advanced for loop like this.*/	
      ArrayList<String> alistv3=new ArrayList<String>();  
      alistv3.add("Gregor Clegane");  
      alistv3.add("Khal Drogo");  
      alistv3.add("Cersei Lannister");  
      alistv3.add("Sandor Clegane"); 
      alistv3.add("Tyrion Lannister");
   
      //iterating ArrayList
      for(String str:alistv3)  
         System.out.println(str);  
      System.out.println("========================");	
/*ArrayList Size
We can use size() method of ArrayList to find the number of elements in an ArrayList.*/	
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(7);
      numbers.add(5);
      numbers.add(6);
      System.out.println("Number of elements in ArrayList: "+numbers.size());
      System.out.println("========================");	 
/*Sort ArrayList
We have a sort() method in the Collections class. This class is is a part of java.util package. 
This method can be used to sort an ArrayList. In the following example we have sorted a list of String type 
alphabetically, however this method works on numeric list (such as Integer type ArrayList) as well.*/      
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      Collections.sort(fruits);

      for (String str : fruits) {
         System.out.println(str);
      }
      System.out.println("========================");	
 /*Methods of ArrayList class
In the above example we have used methods such as add() and remove(). 
However there are number of methods available which can be used directly using object of ArrayList class. 
Let’s discuss few important methods of ArrayList class.

1) add( Object o): This method adds an object o to the arraylist.

obj.add("hello");
This statement would add a string hello in the arraylist at last position.

2) add(int index, Object o): It adds the object o to the array list at the given index.

obj.add(2, "bye");
It will add the string bye to the 2nd index (3rd position as the array list starts with index 0) of array list.

3) remove(Object o): Removes the object o from the ArrayList.

obj.remove("Chaitanya");
This statement will remove the string “Chaitanya” from the ArrayList.

4) remove(int index): Removes element from a given index.

obj.remove(3);
It would remove the element of index 3 (4th element of the list – List starts with o).

5) set(int index, Object o): Used for updating an element. It replaces the element present at the specified index 
with the object o.

obj.set(2, "Tom");
It would replace the 3rd element (index =2 is 3rd element) with the value Tom.

6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this 
method returns the value -1.

int pos = obj.indexOf("Tom");
This would give the index (position) of the string Tom in the list.

7) Object get(int index): It returns the object of list which is present at the specified index.
String str= obj.get(2);
Function get would return the string stored at 3rd position (index 2) and would be assigned to the string “str”. 
We have stored the returned value in string variable because in our example we have defined the ArrayList is of
String type. If you are having integer array list then the returned value should be stored in an integer variable.

8) int size(): It gives the size of the ArrayList – Number of elements of the list.

int numberofitems = obj.size();
9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then 
it returns true else it returns false.

obj.contains("Steve");
It would return true if the string “Steve” is present in the list else we would get false.

10) clear(): It is used for removing all the elements of the array list in one go. The below code will remove all 
the elements of ArrayList whose object is obj.

obj.clear();*/     
      
      
      
      
      
      
      
      
	}	
}
