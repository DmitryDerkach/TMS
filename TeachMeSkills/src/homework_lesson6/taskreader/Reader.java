package homework_lesson6.taskreader;

public class Reader {
	/*Fields*/
	private static Name [] name = new Name[3];
	private static Ticket [] ticket  = new Ticket[3];
	private static Faculty [] faculty = new Faculty [3] ;
	private static Birthday [] birtday = new Birthday [3];
	private static PhoneNum [] phonenumber = new PhoneNum[3];
	private static int counter = 0;
	
	private Book[] book;
	/*Constructors*/
	public Reader() {
	}
	public Reader(Name n, Ticket t, Faculty f, Birthday b, PhoneNum pn) {
		name [counter] = n;
		ticket [counter] = t;
		faculty [counter] = f;
		birtday [counter] = b;
		phonenumber [counter] = pn;
		counter+=1;
	}
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
	
	
	
	
	
	
	
	
	
	
	
}
