package homework_lesson8.taskrobot;

import homework_lesson8.taskrobot.Hands.SamsungHand;
import homework_lesson8.taskrobot.Hands.SonyHand;
import homework_lesson8.taskrobot.Heads.IHead;
import homework_lesson8.taskrobot.Heads.SamasungHead;
import homework_lesson8.taskrobot.Heads.SonyHead;
import homework_lesson8.taskrobot.Heads.ToshibaHead;
import homework_lesson8.taskrobot.Legs.SamsungLeg;

public class Application {
	public static void main(String[] args) {
		/*Задаем значения цены через конструктор (реализовано)*/ 
			Robot r1 = new Robot (new SamasungHead(300), new SamsungHand(300), new SamsungLeg(300));
			r1.getPrice();
			r1.action();
		/*Перед тем как передавать инстанс в метод setHead, задать через сеттеры ему параметры (реализованно)*/
			Robot r2 = new Robot (null, new SamsungHand(300), new SamsungLeg(300));
			r2.getPrice();
			r2.action();
			ToshibaHead th1 = new ToshibaHead();
			th1.setPriece(500);
			r2.setHead(th1);
			r2.getPrice();
			r2.action();
		/*Делаем явное преобразование и обращаемся к методу setPr(int a)*/
			r1.setHead(new ToshibaHead());
			ToshibaHead sh = (ToshibaHead)r1.getHead();
			sh.setPriece(1000);
			r1.setHead(sh);
			r1.getPrice();
			r1.action();
	}
}
