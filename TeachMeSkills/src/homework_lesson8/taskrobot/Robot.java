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
		public Robot(IHand a, ILeg c) {
			hand = a;
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
			int sup = 0;
			int supnum1 = 0;
			int supnum2 = 0; 
			int supnum3 = 0;
			if (hand == null) {
				supnum1 = 0;
			} else {
				supnum1 =  hand.getPrice();
			}
			if (head == null) {
				supnum2 = 0;
			} else {
				supnum2 = head.getPrice();
			}
			if (leg == null) {
				supnum3 = 0;
			} else {
				supnum3 = leg.getPrice();
			}
			sup = supnum1 + supnum2 + supnum3;
			System.out.println("Цена сборки данного робота составляет " + sup);
		}
		
		public void upHand() {
			hand.upHand();
		}
		 public void action() {
			 if (head == null) {
				 System.out.println("Голова не обнаружена");
			 } else {
				 head.speek();
			 }
			 if (hand == null) {
				 System.out.println("Рука не обнаружена");
			 } else {
				 hand.upHand();
			 }
			 if (leg == null) {
				 System.out.println("Нога не обнаружена");
			 } else {
				 leg.step();
			 }
		 }
}
