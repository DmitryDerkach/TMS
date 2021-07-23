package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Перед нами может возникнуть проблема, что если разработчик не реализовал в своем классе, который мы хотим использовать, интерфейс
 *Comparable, либо реализовал, но нас не устривает его функциональность, и мы хотим ее переопределить? На этот случай есть еще более гибкий
 *способ, предполагающий применение интерфейса Comparator<E>
 *Метод compare также возвращает число
 *Для применения интерейса нас вначале надо создать класс компаратора, который реализует этот интерфейс*/
public class ArrayListSortingViaComparator {
public static void main(String[] args) {
	 ArrayList<StudentV2> arraylist = new ArrayList<StudentV2>();
	   arraylist.add(new StudentV2(101, "Zues", 28));
	   arraylist.add(new StudentV2(101, "Zues", 26));
	   arraylist.add(new StudentV2(505, "Abey", 24));
	   arraylist.add(new StudentV2(809, "Vignesh", 32));
	   System.out.println("Student Name Sorting:");
	   Collections.sort(arraylist, StudentV2.StuNameComparator);
	   for(StudentV2 str: arraylist){
			System.out.println(str);
	   }
	   System.out.println("===============");
	   System.out.println("Student Age Sorting:");
	   Collections.sort(arraylist, StudentV2.StuAgeComparator);
	   for(StudentV2 str: arraylist){
			System.out.println(str);
	   }
	   System.out.println("===============");
	   /*Воспользуемся цепочкой компараторов*/
	   Collections.sort(arraylist, StudentV2.StuNameComparator.thenComparing(StudentV2.StuAgeComparator));
	   for(StudentV2 str: arraylist){
			System.out.println(str);
	   }
}
}
class StudentV2 {
	private String studentname;
    private int rollno;
    private int studentage;

    public StudentV2(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }
    public StudentV2() {};

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
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
	public static Comparator<StudentV2> StuNameComparator = new Comparator<StudentV2>() {

		public int compare(StudentV2 s1, StudentV2 s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};
	public static Comparator<StudentV2> StuAgeComparator  = new Comparator<StudentV2>() {
		public int compare(StudentV2 st1, StudentV2 st2) {
			return st1.getStudentage() - st2.getStudentage();
		}
	};
	    
	    
	}
