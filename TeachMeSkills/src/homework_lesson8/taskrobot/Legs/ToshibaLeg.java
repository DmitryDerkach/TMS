package homework_lesson8.taskrobot.Legs;

/* Описание (2026): Нога робота Toshiba - реализация ILeg с ценой; step() выводит "Шаг ногой Тошиба". */
public class ToshibaLeg implements ILeg{
	private int priece;
	
		public ToshibaLeg() {
		
		}
		public ToshibaLeg(int a) {
			priece = a;
		}
		
		@Override
		public void step() {
			System.out.println("Шаг ногой Тошиба");
		}
		@Override
		public int getPrice() {
			return priece;
		}
		public void setPriece(int a) {
			priece = a;
		}

}
