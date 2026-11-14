package homework_lesson8.taskrobot.Heads;

/* Описание (2026): Голова робота Sony - реализация IHead с ценой; speek() выводит "Говорит голова Сони". */
public class SonyHead implements IHead{
	private int price;
	
		public SonyHead() {
			
		}
		public SonyHead(int a) {
			price = a;
		}
		
		@Override
		public void speek() {
			System.out.println("Говорит голова Сони");
			
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public int getPrice() {
			return price;
		}
}
