package homework_lesson14.moshcourse;

public class LambdaDemo {
	//public static String prefixV2 = "+";
	 /*Local variable*/
	 public String prefix = "-";
	 
	 public void show() {
		 
//	 greet(new ConsolePrinter());
		 
	 /*By using anonymous inner class*/
//	 greet(new Printer() {
//
//		@Override
//		public void print(String message) {
//			System.out.println(message);
//		}	 
//	 });
		 
	 /*Перепишем анонимку в виде лямбда-выражения*/
		 
	 /*Т.е. вот это и то, что выше - це одно и тоже*/
//	 greet((String message) -> {
//		 System.out.println(prefix + prefixV2 +  + message); /*Можно юзать переменные класса и переменные метода*/
//	 });
		 
	 greet((String message) -> {
		 System.out.println(this.prefix + message); /*Отличие от анонимного класса. this будет указывать на экземпляр класса LambdaDemo, а 
		 в анонимке на экземпляр анонимного класса, так же в анонимке могут быть поля, для хранения каких-то данных, а в лямбде такого быть
		 не может*/
	 });
	 
	 /*Вот это*/
	 //Printer print = new ConsolePrinter();
	 /*Можно представить так*/
	 //Printer print = message -> System.out.println(message);
 }
 public static void greet(Printer printer) {
	 printer.print("Hello World");
	 
 }
}
