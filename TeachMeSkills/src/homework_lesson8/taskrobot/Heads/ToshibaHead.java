package homework_lesson8.taskrobot.Heads;

public class ToshibaHead implements IHead {
	private int priece;
	
		public ToshibaHead() {
		
		}
		public ToshibaHead(int a) {
			priece = a;
		}
		
		public int getPrice() {
			return priece;
		}
		public void setPriece(int a) {
			priece = a;
		}
		@Override
		public void speek() {
			System.out.println("Говорит голова Тошиба");
		}
}
