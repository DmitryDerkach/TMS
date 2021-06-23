package homework_lesson8.taskprintable;

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
