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
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new Reader(Name.NAME1.getName(i), Ticket.TICKET1.getTicket(), Faculty.FACULTY1.getFaculty(), Birthday.BIRTDAY1.getBirtday(), PhoneNum.NUM1.getNum()); 
		}
	for (int i = 0; i < 3; i++) {
		System.out.println(guest[i]);
	}

		
}
}

