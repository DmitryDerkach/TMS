package homework_lesson6.taskperson;

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
