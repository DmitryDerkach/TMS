package homework_lesson5.taskphone;

/* Описание (2026): Точка входа задачи "Телефон": создаёт три объекта Phone разными конструкторами, выводит информацию о них, вызывает входящие звонки и отправку сообщений на несколько номеров. */
public class PhoneApplication {
public static void main(String[] args) {
	
Phone mobile1 = new Phone(17812498, "Iphone", 270);	
Phone mobile2 = new Phone(6666666, "Simens");	
Phone mobile3 = new Phone();	

mobile1.getInfo();
mobile2.getInfo();
mobile3.getInfo();

mobile1.reciveCall("Dima");
System.out.println(mobile1.getNumber()); 
	mobile2.reciveCall("Vasya");
	System.out.println(mobile2.getNumber()); 
		mobile3.reciveCall("Olya");
		System.out.println(mobile3.getNumber()); 
	
mobile1.reciveCall("Ilya", 123456);
mobile1.sendMessage(11212, 22222, 55555);

}
}
