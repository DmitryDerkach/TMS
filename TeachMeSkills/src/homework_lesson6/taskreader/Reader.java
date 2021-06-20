package homework_lesson6.taskreader;

import java.util.Arrays;

public class Reader {
	/*Fields*/
	private  String name;
	private  int  ticket;
	private  String  faculty;
	private  String  birtday;
	private  String  phonenumber;
	private static int counter = 0;
	
	private Book[] book;
	/*Constructors*/
	public Reader(String name, int ticket, String faculty, String birtday, String phonenumber) {
		this.name = name;
		this.ticket = ticket;
		this.faculty = faculty;
		this.birtday = birtday;
		this.phonenumber = phonenumber;
	}
//	public Reader(Name n, Ticket t, Faculty f, Birthday b, PhoneNum pn) {
//		name [counter] = n;
//		ticket [counter] = t;
//		faculty [counter] = f;
//		birtday [counter] = b;
//		phonenumber [counter] = pn;
//		counter+=1;
//	}
		public void takeBook(int num) {
			System.out.println(this.name + " взял " + num + " книг");	
		}
		public void takeBook(String ... nameofbooks) {
			System.out.print(this.name + " взял книги: \n");
				for(String i: nameofbooks) {
					System.out.print(i + " ");
			}
		}
		public void takeBook(Book ... nameofbooksandauthors) {
			System.out.print(this.name + " взял книги: \n");
				book = nameofbooksandauthors;
				for(Book i: book) {    				
					System.out.println(i.getBookname());
					System.out.println(i.getAuthor());
				}
				
		}
		@Override
		public String toString() {
			return "Reader: [name=" + name + ", ticket=" + ticket + ", faculty=" + faculty + ", birtday=" + birtday
					+ ", phonenumber=" + phonenumber + "]";
		}	
	
	
	
	
	
	
	
	
	
	
	
}
