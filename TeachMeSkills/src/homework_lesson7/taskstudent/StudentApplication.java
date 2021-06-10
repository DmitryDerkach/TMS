package homework_lesson7.taskstudent;

public class StudentApplication {
public static void main(String[] args) {
	
    Student student1 = new Aspirant("Ivan", "Ivanov", 105, 5, "Programming");
    Student student2 = new Student("Vasia", "Vasiliev", 108, 5);
    Student student3 = new Aspirant("Kostia", "Ivanov", 204, 5, "Engineering");
	
    Student [] arr = new Student[3];
		arr [0] = new Aspirant("Ivan", "Ivanov", 105, 5, "Programming");
		arr [1] = new Student("Vasia", "Vasiliev", 108, 5);
		arr [2] = new Aspirant("Kostia", "Ivanov", 204, 5, "Engineering");
			for (int i = 0; i < 3; i++) {
				System.out.println(arr[i].getScholarship());
			}
}
}
