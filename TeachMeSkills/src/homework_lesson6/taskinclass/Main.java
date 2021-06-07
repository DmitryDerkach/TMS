package homework_lesson6.taskinclass;

public class Main {
public static void main(String[] args) {
	
Human ilya = new Human();
Human jimmy = new Human("Jimmy");
//ilya.setName("Ilya");
//System.out.println(ilya.getAge());
//System.out.println(ilya.getName());
jimmy.setAge(20);
System.out.println(jimmy.getAge());
//jimmy.showInfo(); //null pointer exeption
//
// System.out.println();
//
Ability run = new Ability();
run.setName("Ability to Run");
Human dima = new Human(run);
String s = dima.getAbility().getName();
System.out.println(s);
run.displayAbility();
	}

}
