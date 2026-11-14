package homework_lesson8.taskrobot.Hands;

/* Описание (2026): Рука робота Toshiba - реализация IHand с ценой (через конструктор или setPrice); upHand() берётся из default-метода интерфейса. */
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
