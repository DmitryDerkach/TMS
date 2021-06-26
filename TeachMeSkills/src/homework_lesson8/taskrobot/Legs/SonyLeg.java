package homework_lesson8.taskrobot.Legs;

public class SonyLeg implements ILeg{
	private int priece;
	
		public SonyLeg() {

		}
		public SonyLeg(int a) {
			priece = a;
		}
		
		@Override
		public void step() {
			System.out.println("Шаг ногой Сони");
		}
		@Override
		public int getPrice() {
			return priece;
		}
		public void setPriece(int a) {
			priece = a;
		}

}
