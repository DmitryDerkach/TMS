package homework_lesson8.taskrobot.Hands;

public class ToshibaHand implements IHand {
	private int price;
		public ToshibaHand() {
			
		}
		public ToshibaHand(int price) {
			this.price = price;
		}

		@Override
		public int getPrice() {
			return price;
		}
		public void setPrice(int a) {
			price = a;
		}

}
