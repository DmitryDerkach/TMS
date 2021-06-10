package homework_lesson6.taskreader;

import java.util.Random;
import homework_lesson6.taskreader.Book;
public class ReaderApplication {	
public static void main(String[] args) {
/*Создаем 2 объекта класса Book*/
Book num1 = new Book();
Book num2 = new Book();
	num1.setAuthor("Пушкин");
	num1.setBookname("3 богатыря");
	num2.setAuthor("Гоголь");
	num2.setBookname("Мертвые души");
/*Создаем пару объектов класса Reader и массив, в котором эти объекты будут хранится*/
Random r = new Random();	
Reader [] guest = new Reader[3];
String a = "number 0";
	for (int i = 0; i < guest.length;) {
		guest[i] = new Reader ("Vasya " + (a), 1, "bio" + a, r.nextInt(22), r.nextInt(500)); 	
		i+=1;
		a = "number " + i;
	}
//guest[0].takeBook(2);
//guest[2].takeBook(5);
//guest[1].takeBook("dfdfd", "wewewe");	
guest[1].takeBook(num1, num2);
	
	

}
}
