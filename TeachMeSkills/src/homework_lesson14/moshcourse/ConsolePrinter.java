package homework_lesson14.moshcourse;

public class ConsolePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println(message);
	}
}
