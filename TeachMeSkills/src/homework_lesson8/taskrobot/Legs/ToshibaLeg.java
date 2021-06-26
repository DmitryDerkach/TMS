package homework_lesson8.taskrobot.Legs;

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
