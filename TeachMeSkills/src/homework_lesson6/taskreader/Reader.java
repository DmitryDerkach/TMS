package homework_lesson6.taskreader;

public class Reader {
	/*Fields*/
	private String fullname;
	private int ticketnum;
	private String faculty;
	private int birthdate;
	private int phonenumber;
	private Book[] link;
	/*Constructors*/
	public Reader() {
		
	}
	public Reader(String fullname, int ticketnum, String faculty, int birthdate, int phonenumber) {
		this.fullname = fullname;
		this.ticketnum = ticketnum;
		this.faculty = faculty;
		this.birthdate = birthdate;
		this.phonenumber = phonenumber;
	}
	/*Methods*//*getters and setters*/
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getTicketnum() {
		return ticketnum;
	}
	public void setTicketnum(int ticketnum) {
		this.ticketnum = ticketnum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	/*end of getters and setters*/
	public void takeBook(int num) {
		System.out.println(this.fullname + " взял " + num + " книг");	
	}
	public void takeBook(String ... nameofbooks) {
		System.out.print(this.fullname + " взял книги: \n");
			for(String i: nameofbooks) {
				System.out.print(i + " ");
		}
	}
/*Почему не работает вот так*/	
//	public void takeBook(Book ... nameofbooksandauthors) {
//		System.out.print(this.fullname + " взял книги: \n");
//			link = nameofbooksandauthors;
//			for(int z: link.length-1) {
//				System.out.println(link[z].getBookname());
//				System.out.println(link[z].getAuthor());
//			}
//		
//	}
/*И почему работает вот так?*/
	public void takeBook(Book ... nameofbooksandauthors) {
		System.out.print(this.fullname + " взял книги: \n");
			link = nameofbooksandauthors;
			for(Book i: link) {    				
				System.out.println(i.getBookname());
				System.out.println(i.getAuthor());
			}
	}	
	
	
	
	
	
	
	
	
	
	
	
}
