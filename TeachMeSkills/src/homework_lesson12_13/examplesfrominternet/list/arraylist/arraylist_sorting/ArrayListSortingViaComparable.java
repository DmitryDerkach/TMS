package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_sorting;

import java.util.ArrayList;
import java.util.Collections;

/*In this tutorial we will see how to sort an ArrayList of Objects by property using comparable and comparator interface*/
/*We generally use Collections.sort() method to sort a simple array list. 
 *However if the ArrayList is of custom object type then in such case you have two options for sorting- comparable and comparator interfaces.
 *Before going through the example of them, let’s see what’s the output when we try to sort Arraylist of Objects without implementing 
 *any of these interfaces.*/
public class ArrayListSortingViaComparable {
public static void main(String[] args) {
	ArrayList<Student> al1 = new ArrayList<Student>();
	Student st1 = new Student(223, "Chitanya", 26);
	al1.add(st1);
	Student st2  = new Student();
	st2.setRollno(245);
	st2.setStudentname("Rahul");
	st2.setStudentage(24);
	al1.add(st2);
	al1.add(new Student(209, "Ajeet", 32));
	/*Проверяем, заполнился ли наш массив*/
	{
	int counter = 1;
	for (Student st: al1) {
		System.out.println("Information about student N" + counter);
		counter++;
		System.out.println("RollNumber: " + st.getRollno());
		System.out.println("StudentName: " + st.getStudentname());
		System.out.println("StudentAge: " + st.getStudentage());
		System.out.println("====================");
	}
	}
	/*Collections.sort(al1); Мы не можем вызвать данный метод, т.к. не понятно, по каким критериям мы хотим сортировать элементы нашей кол-
	 *лекции*/
	
	/*Sorting of ArrayList<Object> with Comparable*/
	/*Let’s say we need to sort the ArrayList<Student> based on the student Age property. 
	 *This is how it can be done – First implement Comparable interface and then Override the compareTo method.*/
	/*Change our Student class*/
		Collections.sort(al1);
		for (Student s: al1) {
			System.out.println(s);
		}
}
}

/*Consider the below example – I have a Student class which has properties like Student name, roll no and student age.*/
class Student implements Comparable<Student>{
	private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }
    public Student() {};

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }
	@Override
	public int compareTo(Student st) {
		int compareage = (st.getStudentage());
		/*For ascending order*/;
		return this.studentage - compareage;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}	
	
}
/*And I want to have an ArrayList of Student Object. We do it like this*/
/*Возвращаемся выше и пытаемся отсортировать*/
