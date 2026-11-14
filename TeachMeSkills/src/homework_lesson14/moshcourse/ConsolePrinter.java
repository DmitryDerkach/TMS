package homework_lesson14.moshcourse;

/* Описание (2026): обычная (именованная) реализация функционального интерфейса Printer, печатающая сообщение в консоль — для сравнения с анонимным классом и лямбдой в LambdaDemo. */
public class ConsolePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println(message);
	}
}
