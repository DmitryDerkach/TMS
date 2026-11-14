package homework_lesson8.space;

/* Описание (2026): Космодром, хранящий аппарат типа IStart. launch() выполняет предстартовую проверку и при успехе запускает двигатели, ведёт обратный отсчёт от 10 до 1 и даёт старт; при провале проверки запуск отменяется. */
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
