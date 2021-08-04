package homework_lesson14.moshcourse;

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
