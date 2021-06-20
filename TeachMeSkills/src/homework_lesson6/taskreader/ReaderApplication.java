package homework_lesson6.taskreader;

import java.util.Random;
import homework_lesson6.taskreader.Book;
public class ReaderApplication {	
public static void main(String[] args) {
/*Создаем 3 объекта класса Book*/
Book num1 = new Book("3 богатрыя","Пушкин");
Book num2 = new Book("Мертвые души","Гоголь");
Book num3 = new Book("Песнь льда и пламени","Джорж РР Мартин");
/*Создаем массив объектов класса Reader*/
	Random r = new Random();	
	Reader [] guest = new Reader[3];
		for (int i = 0; i < guest.length;) {
			guest[i] = new Reader(Name.NAME[i], Ticket.TICKET1, Faculty.FACULTY1, Birthday.BIRTDAY1, PhoneNum.NUM1); 
			i+=1;
		}
		
	

}
}
