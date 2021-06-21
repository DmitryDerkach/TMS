package homework_lesson7.taskcar.Car;

import homework_lesson7.taskcar.Driver.Person;
import homework_lesson7.taskcar.Engine.Engine;

public class Lorry extends Car {
	private int carrying;
	
		public Lorry(String marka, String carClass, int weight, Engine engine, Person driver, int carrying) {
		super(marka, carClass, weight, engine, driver);
		this.carrying = carrying;
	}

		public int getCarrying() {
			return carrying;
		}
	
		public void setCarrying(int carrying) {
			this.carrying = carrying;
		}

		@Override
		public String toString() {
			return super.toString() + ", carrying=" + carrying;
		}
		
		
		
}
