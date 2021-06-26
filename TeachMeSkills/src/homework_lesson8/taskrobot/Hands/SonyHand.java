package homework_lesson8.taskrobot.Hands;

public class SonyHand implements IHand {
	private int price;
	
		public SonyHand() {
			
		}
		public SonyHand(int p) {
			price = p;
		}

		public void setPrice(int pr) {
			price = pr;
		}
		@Override
		public int getPrice() {
			return price;
		}
}
