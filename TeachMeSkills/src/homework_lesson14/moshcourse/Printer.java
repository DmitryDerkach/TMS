package homework_lesson14.moshcourse;

/* Описание (2026): функциональный интерфейс с одним абстрактным методом print(String); default-метод printTwice и static-метод testMethod показывают, что они не мешают интерфейсу оставаться функциональным. */
public interface Printer {
	void print(String message); // This is functional interface
	
	default void printTwice(String message) { /*Stil functional interface because only one abstract method*/
		System.out.println(message);
		System.out.println(message);
	}
	
	static void testMethod() {
		System.out.println("Static method"); /*Stil functional interface because only one abstract method*/
	}
}
