package homework_lesson8.taskrobot.Heads;

public class ToshibaHead implements IHead {
	private int pr;
		public ToshibaHead() {
		
		}
		
	public int getPrice() {
			return pr;
		}

	public void setPr(int pr) {
		this.pr = pr;
	}

	@Override
	public void speek() {
		System.out.println("Говорит голова Тошиба");
		
	}

	

}
