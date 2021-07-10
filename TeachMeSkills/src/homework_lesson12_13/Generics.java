package homework_lesson12_13;
/*Дженерики*/
public class Generics {
	public static void main(String[] args) {
		
		/*
		 * Обобщения позволяют не указывать конкретный тип, который будет
		 * использоваться. Определим класс Account как обобщенный
		 */
		class Account<T>{
			private T id;
			private int sum;
				public Account(T id, int sum) {
					this.id = id;
					this.sum = sum;
				}
			public T getId() {
				return id;
			}
			public int getSum() {
				return sum;
			}
			public void setSum(int sum) {
				this.sum = sum;
			}
		}
	Account <String> acc1 = new Account<String>("1188", 10);
	String acc1id = acc1.getId();
	System.out.println(acc1id);
	
	Account <Integer> acc2 = new Account<Integer>(2111, 20);
	Integer acc2id = acc2.getId();
	System.out.println(acc2id);
	System.out.println("============================");
	/*
	 * Кроме обобщенных типов можно также создавать обобщенные методы, которые точно
	 * также будут использовать универсальные параметры. Например:
	 */
		class Printer {
			public <T> void print(T[] items) {
				for (T item: items) {
					System.out.print(item + " ");
				}
			}
		}
		/*
		 * Особенностью обобщенного метода является использование универсального
		 * параметра в объявлении метода после всех модификаторов и перед типом
		 * возвращаемого значения. Затем внутри метода все значения типа Т будут
		 * представлять данный универсальный параметр
		 */
	Printer printer = new Printer();
	String [] people = {"Tom", "Dmitry", "Ann"};
	Integer[] nums = {24,23,19};
	printer.<String>print(people);
	System.out.println();
	printer.<Integer>print(nums);
	System.out.println();
	System.out.println("============================");
	/* Мы можем также задать сразу несколько универсальных параметров */		
		class Account1<T,S>{
			private T id;
			private S sum;
			
			public Account1(T id, S sum) {
				this.id = id;
				this.sum = sum;
			}
			public T getId() {
				return id;
			}
			public S getSum() {
				return sum;
			}
			public void setSum(S sum) {
				this.sum = sum;
			}
		}
	Account1 <String, Double> accv2 = new Account1<String, Double>("354", 18.77);
	String idv2 = accv2.getId();
	Double sumv2 = accv2.getSum();
	System.out.printf("Id = %s\nSum = %f", idv2, sumv2);
	System.out.println();
	System.out.println("============================");
	
	}

}
