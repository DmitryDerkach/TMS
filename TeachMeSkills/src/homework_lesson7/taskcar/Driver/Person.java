package homework_lesson7.taskcar.Driver;

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
