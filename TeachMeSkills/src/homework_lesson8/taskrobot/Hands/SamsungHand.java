package homework_lesson8.taskrobot.Hands;

public class SamsungHand implements IHand{
	private int price;
	
		public SamsungHand(){
			
		}
		public SamsungHand(int price) {
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
