package homework_lesson7.taskcar.Driver;

/* Описание (2026): Наследник Driver, добавляющий возраст; именно объекты Person передаются в Car как водитель (ФИО, стаж, возраст). */
public class Person extends Driver {
	private int age;

		public Person(String fullName, int experience, int age) {
			super(experience, fullName);
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [age=" + age + "]";
		}
		
		

}
