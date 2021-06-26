package homework_lesson8.space;

public class Spaceport {
	private IStart ist;
	
		public Spaceport() {
			
		}
		public Spaceport(IStart ist) {
			this.ist = ist;
		}

		public IStart getIst() {
			return ist;
		}
		public void setIst(IStart ist) {
			this.ist = ist;
		}
		public void launch(IStart a) {
			ist = a;
			boolean supnum = ist.systemCheck();
			if (supnum == false) {
				System.out.println("Предстартовая проверка провалена");
				return;
			}
			ist.engineStart();
			int i = 10;
			do {
				System.out.println(i);
				i--;
			}while(i >= 1);
			ist.start();
		}
}
