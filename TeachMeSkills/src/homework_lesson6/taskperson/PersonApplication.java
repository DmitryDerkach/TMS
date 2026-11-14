package homework_lesson6.taskperson;

/* Описание (2026): Проверка класса Person: один объект создается пустым конструктором и заполняется сеттерами, второй - конструктором с параметрами; оба выводят информацию о себе. */
public class PersonApplication {
	public static void main(String[] args) {
		
		Person dima = new Person();
		dima.setAge(18);
		dima.setFullName("Dima");
		Person vasya = new Person("Vasya", 22);
		dima.getInfo();
		vasya.getInfo();
		
		
	}

}
