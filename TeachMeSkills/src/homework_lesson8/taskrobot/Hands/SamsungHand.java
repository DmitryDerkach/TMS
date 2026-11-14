package homework_lesson8.taskrobot.Hands;

/* Описание (2026): Рука робота Samsung - реализация IHand с ценой (через конструктор или setPrice); upHand() берётся из default-метода интерфейса. */
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
