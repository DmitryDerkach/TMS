package homework_lesson7.taskstudent;

public class StudentApplication {
	public static void main(String[] args) {
		Student first = new Aspirant("Вася", "Пупкин", 1, 4.1, "Джава как смысл жизни");
		Student second = new Student("Егор", "Егоров", 2, 1);
		Student third = new Aspirant("Генадий", "Тапкович", 3, 5.0, "Лень как двигатель прогресса");
		Student [] student = {first, second, third};
			for (Student st: student) {
				System.out.println(st.getScholarship());
			}
	}
}

