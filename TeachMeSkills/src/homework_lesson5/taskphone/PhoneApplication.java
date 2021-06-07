package homework_lesson5.taskphone;

public class PhoneApplication {
public static void main(String[] args) {
	
Phone mobile1 = new Phone(17812498, "Iphone", 270);	
Phone mobile2 = new Phone(6666666, "Simens");	
Phone mobile3 = new Phone();	

mobile1.getInfo();
mobile2.getInfo();
mobile3.getInfo();

mobile1.reciveCall("Dima");
mobile1.setNumber(1111);
int a = mobile1.getNumber(); 
System.out.println(a);
mobile1.reciveCall("Ilya", 123456);
mobile1.sendMessage(11212, 22222, 55555);

//mobile1.setModel("Samsung");
//mobile1.setNumber(123456);
//mobile1.setWeight(270);

//int a = mobile1.getNumber();
//System.out.println(a);

	
	
	
	
	

}
}
