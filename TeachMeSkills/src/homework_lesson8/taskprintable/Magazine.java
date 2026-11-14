package homework_lesson8.taskprintable;

/* Описание (2026): Журнал - реализация Printable: print() выводит "Magazine"; статический printMagazines() выводит из массива Printable только объекты Magazine (через instanceof). */
public class Magazine implements Printable{
	public void print() {
		System.out.println("Magazine");
	}
	public static void printMagazines(Printable[] print) {
		for (int i = 0; i < print.length; i++) {
			if (print[i] instanceof Magazine) {
				System.out.println(print[i].toString());
			}
		}
		
	}
	@Override
	public String toString() {
		return "It's a magazine";
	}
	
}
