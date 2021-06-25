package homework_lesson8.taskrobot.Legs;

public class SamsungLeg implements ILeg {
	private int pr;
		public SamsungLeg(int pr) {
			this.pr = pr;
		}
	@Override
	public void step() {
		System.out.println("Шаг ногой Самсунг");
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pr;
	}

}
