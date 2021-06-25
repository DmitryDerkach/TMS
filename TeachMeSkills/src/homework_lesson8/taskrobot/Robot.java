package homework_lesson8.taskrobot;

import homework_lesson8.taskrobot.Hands.IHand;
import homework_lesson8.taskrobot.Heads.IHead;
import homework_lesson8.taskrobot.Legs.ILeg;

public class Robot {
	private IHand hand;
	private IHead head;
	private ILeg leg;
		public Robot(IHead b, IHand a, ILeg c) {
			hand = a;
			head = b;
			leg = c;
		}
		
		public IHand getHand() {
			return hand;
		}

		public void setHand(IHand hand) {
			this.hand = hand;
		}

		public IHead getHead() {
			return head;
		}

		public void setHead(IHead head) {
			this.head = head;
		}

		public ILeg getLeg() {
			return leg;
		}

		public void setLeg(ILeg leg) {
			this.leg = leg;
		}

		public void getPrice() {
			int sup = hand.getPrice() + head.getPrice() + leg.getPrice();
			System.out.println("Цена сборки данного робота составляет " + sup);
		}
		
		public void upHand() {
			hand.upHand();
		}
		 public void action() {
		        head.speek();
		        hand.upHand();
		        leg.step();
		 }
}
