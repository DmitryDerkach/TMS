package homework_lesson8.taskrobot;

import homework_lesson8.taskrobot.Hands.SamsungHand;
import homework_lesson8.taskrobot.Hands.SonyHand;
import homework_lesson8.taskrobot.Heads.IHead;
import homework_lesson8.taskrobot.Heads.SamasungHead;
import homework_lesson8.taskrobot.Heads.ToshibaHead;
import homework_lesson8.taskrobot.Legs.SamsungLeg;

public class Application {
	public static void main(String[] args) {
		Robot r1 = new Robot (new SamasungHead(300), new SamsungHand(300), new SamsungLeg(300));
		r1.getPrice();
		r1.action();
		r1.setHand(new SonyHand(100));
		r1.setHead(new ToshibaHead());
		r1.getPrice();
		r1.action();
//		Robot = new Robot (/*Head, Hand, Leg*/);
//		Robot = new Robot (/*Head, Hand, Leg*/);
	}
}
