package homework_lesson8.tasktool;

public class Appliciation {
	public static void main(String[] args) {
		Tool t0 = new Pipe(30);
		Tool t1  = new Guitar(6);
		Tool t2 = new Drum("Big");
			Tool [] arrayoftools = {t0,t1,t2};
				for (int i = 0; i < arrayoftools.length; i++) {
					arrayoftools[i].play();
				}	
	}
}
