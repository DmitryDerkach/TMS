package homework_lesson7.taskcar.Car;

import homework_lesson7.taskcar.Driver.Person;
import homework_lesson7.taskcar.Engine.Engine;

/* Описание (2026): Спорткар - наследник Car с дополнительным полем maxspeed; переопределяет toString, дописывая максимальную скорость к данным родителя через super.toString(). */
public class SportCar extends Car {
	private int maxspeed;

		public SportCar(String marka, String carClass, int weight, Engine engine, Person driver, int maxspeed) {
		super(marka, carClass, weight, engine, driver);
		this.maxspeed = maxspeed;
	}

		public int getMaxspeed() {
			return maxspeed;
		}
	
		public void setMaxspeed(int maxspeed) {
			this.maxspeed = maxspeed;
		}

		@Override
		public String toString() {
			return super.toString() + ", maxspeed=" + maxspeed;
		}
		
		
}
