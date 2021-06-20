package homework_lesson6.taskreader;

public class Book {
	/*Поля*/
	String bookname;
	String author;
	/*Конструкторы*/
	public Book(){
		
	}
	public Book(String a, String b) {
		bookname = a;
		author = b;
	}
	/*Методы*/
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
