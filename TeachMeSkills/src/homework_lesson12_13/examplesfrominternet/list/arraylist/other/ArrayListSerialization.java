package homework_lesson12_13.examplesfrominternet.list.arraylist.other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*ArrayList is serializable by default. 
 *This means you need not to implement Serializable interface explicitly in order to serialize an ArrayList.
 *In this tutorial we will learn how to serialize and de-serialize an ArrayList.*/
public class ArrayListSerialization {
/*Example:
Serialization: Run the below class and it will create a file myfile which will be having ArrayList object in form of Stream of bytes.
We would be using “myfile” at the receivers end to recreate the Object from stream of bytes. 
Note: We did not implemented the Serializable interface in the below class because ArrayList is already been serialized by default.*/
public static void main(String[] args) {
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("Hello.");
	al1.add("My");
	al1.add("name");
	al1.add("is");
	al1.add("Dima!");
	FileOutputStream fos = null;
	try {
		 fos = new FileOutputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson12_13\\examplesfrominternet\\list\\arraylist\\other\\Note.txt");
	} catch (FileNotFoundException e) {
		System.out.println("Ошибка FNF");
	}
	
	ObjectOutputStream oos = null;
	try {
		oos = new ObjectOutputStream(fos);
	} catch (IOException e) {
		System.out.println("Ошибка IO");
	}
		
	try {
		oos.writeObject(al1);
	} catch (IOException e) {
		System.out.println("Ошибка IO #2" );
	}
/*De-Serialization:

In this class we are retrieving the stream of bytes from myfile which we have stored using the above class. 
We are type casting the returned object to ArrayList and displaying the elements of ArrayList. Observe the output:
We are getting the same elements which we have added to the ArrayList before the serialization.*/	
	ArrayList<String> al2 = new ArrayList<String>();
	FileInputStream fis = null;
	try {
		fis = new FileInputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson12_13\\examplesfrominternet\\list\\arraylist\\other\\Note.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ObjectInputStream ois = null;
	try {
		ois = new ObjectInputStream(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Object obj = null;
	try {
		obj = ois.readObject();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	al2 = (ArrayList)obj;
	for (String s: al2) {
		System.out.print(s + " ");
	}
}
}
