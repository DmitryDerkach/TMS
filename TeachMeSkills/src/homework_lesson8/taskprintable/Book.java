package homework_lesson8.taskprintable;

/* Описание (2026): Книга - реализация Printable: print() выводит "Book"; статический printBooks() выводит из массива Printable только объекты Book (через instanceof). */
public class Book implements Printable{
	public void print() {
		System.out.println("Book"); 
	}
	public static void printBooks(Printable[] print) {
		for (int i = 0; i < print.length; i++) {
			if (print[i] instanceof Book) {
				System.out.println(print[i].toString());
			}
		}
	}
	@Override
	public String toString() {
		return "This is a book";
	}
	
}
