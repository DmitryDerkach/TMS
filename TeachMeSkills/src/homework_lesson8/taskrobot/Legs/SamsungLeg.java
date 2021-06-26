package homework_lesson8.taskrobot.Legs;

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
