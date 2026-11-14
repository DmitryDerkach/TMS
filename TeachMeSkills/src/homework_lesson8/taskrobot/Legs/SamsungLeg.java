package homework_lesson8.taskrobot.Legs;

/* Описание (2026): Нога робота Samsung - реализация ILeg с ценой; step() выводит "Шаг ногой Самсунг". */
public class SamsungLeg implements ILeg {
	private int priece;
	
		public SamsungLeg() {
			
		}
		public SamsungLeg(int pr) {
			priece = pr;
		}
		
		@Override
		public void step() {
			System.out.println("Шаг ногой Самсунг");
		}
		@Override
		public int getPrice() {
			return priece;
		}
		public void setPriece(int a) {
			priece = a;
		}

}
