package homework_lesson8.taskrobot.Hands;

/* Описание (2026): Рука робота Sony - реализация IHand с ценой (через конструктор или setPrice); upHand() берётся из default-метода интерфейса. */
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
