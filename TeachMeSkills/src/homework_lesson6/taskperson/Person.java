package homework_lesson6.taskperson;

public class Person {
	/*Поля*/
	private String fullName;
	private int age;
	/*Конструкторы*/
	public Person(){
		
	}
	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	/*Методы*/
	public void move() {
		System.out.println(fullName + " говорит");
	}
	public void talk() {
		System.out.println(fullName + " идет");
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*Проверка того, что все правильно сделано*/
	public void getInfo() {
		System.out.println("Имя: " + fullName + "." + " Возраст: " + age + ".");
	}
	
	
	
	
	
	
	
}
