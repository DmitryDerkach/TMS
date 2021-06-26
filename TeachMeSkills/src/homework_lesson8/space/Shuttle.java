package homework_lesson8.space;

import java.util.Random;

public class Shuttle implements IStart {
	@Override
	public boolean systemCheck() {
		Random r = new Random();
		int a = r.nextInt(11);
		if (a > 3) {
			return true;
		} else {
		return false;
		}
	}
	@Override
	public void engineStart() {
		System.out.println("Двигатели шатла запущены. Все системы в нороме");
	}
	@Override
	public void start() {
		System.out.println("Шатл стартовал");
	}

}
