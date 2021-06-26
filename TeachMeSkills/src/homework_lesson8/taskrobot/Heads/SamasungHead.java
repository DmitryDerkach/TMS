package homework_lesson8.taskrobot.Heads;

public class SamasungHead implements IHead {
	private int price;
	
		public SamasungHead() {
			
		}
		public SamasungHead(int p) {
			price = p;
		}
		
		@Override
		public void speek() {
			System.out.println("Говорит голова Самсунг");
		}
		@Override
		public int getPrice() {
			return price;
		}
		public void setPrice(int a) {
			price = a;
		}

}
