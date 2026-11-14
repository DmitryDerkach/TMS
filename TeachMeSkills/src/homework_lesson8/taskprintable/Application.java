package homework_lesson8.taskprintable;

/* Описание (2026): Задача Printable: книга и журнал лежат в массиве типа интерфейса Printable и печатаются в цикле полиморфно; затем статические Magazine.printMagazines() и Book.printBooks() через instanceof выводят из массива только журналы или только книги. */
public class Application {
	public static void main(String[] args) {
	Printable test = new Book();
	Printable test1 = new Magazine();
		Printable [] arrayofliterature = {test,test1};
			for (Printable p: arrayofliterature) {
				p.print();
			}
		Magazine.printMagazines(arrayofliterature);	
		Book.printBooks(arrayofliterature);
	}
}
