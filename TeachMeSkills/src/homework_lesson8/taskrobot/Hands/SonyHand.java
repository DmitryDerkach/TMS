package homework_lesson8.taskrobot.Hands;

public class SonyHand implements IHand {
	private int pr;
		public SonyHand(int p) {
		pr = p;
		}
	
	public int getPrice() {
	
		return pr;
	}

}
