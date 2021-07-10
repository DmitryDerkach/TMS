package homework_lesson8;

/*Читал метанит по интерфейсам. Пару моментов показались довольно трудными и требующими проработки. 
 *Поэтому напишу эти примеры здесь. Вроде как на этом занятии мы разбирали интерфейсы*/
public class Note {
	public static void main(String[] args) {
		/*Наследование интерфесов
		 *Интерфесы как и классы могут наследоваться. Например:
		 *interface BookPrintable extends Printable{
		 *	void paint();
		 *}
		 *При примении этого интерфейса класс Book должен будет реализовать как методы интрфейса BookPrintale, так и методы базового ин-
		 *терфейса Printable
		 *
		 *Интерфейсы как параметры и результаты методов
		 *И также как и в случае с классами, интерфейсы могут использоваться в качестве типа параметров метода или в кчестве возв-
		 *ращаемого типа:*/
		Printable printable = Note.createPrintable("Foreign Affairs", false); 
		/*результатом выполнения правой стороны кода является эеземпляр класса. Либо класса Book, либо класса Journal. Оба
		 * этих класса имплементируют интерфейс Printable, поэтому и с правой частью проблем никаких не возникает */ 
		printable.print();

		Note.read(new Book("Java for impatients", "Cay Horstmann"));
		Note.read(new Journal("Java Dayly News"));
	}

	static void read(Printable p) {

		p.print();
	}

	static Printable createPrintable(String name, boolean option) {

		if (option)
			return new Book(name, "Undefined");
		else
			return new Journal(name);
	}
}

interface Printable {

	void print();
}

class Book implements Printable {

	String name;
	String author;

	Book(String name, String author) {

		this.name = name;
		this.author = author;
	}

	public void print() {

		System.out.printf("%s (%s) \n", name, author);
	}
}

class Journal implements Printable {

	private String name;

	String getName() {
		return name;
	}

	Journal(String name) {

		this.name = name;
	}

	public void print() {
		System.out.println("Journal: " + name);
	}
}
/*
 * Метод read() в качестве параметра принимает объект интерфейса Printable,
 * поэтому в этот метод мы можем передать как объект Book, так и объект Journal.
 * 
 * Метод createPrintable() возвращает объект Printable, поэтому также мы можем
 * возвратить как объект Book, так и Journal.
 */