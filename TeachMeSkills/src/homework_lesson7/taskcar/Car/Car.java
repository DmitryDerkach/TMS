package homework_lesson7.taskcar.Car;

import homework_lesson7.taskcar.Driver.Driver;
import homework_lesson7.taskcar.Driver.Person;
import homework_lesson7.taskcar.Engine.Engine;

public class Car {
	private String marka;
	private String carClass;
	private int weight;
	private Person driver;
	private Engine engine;
	
		public Car(String marka, String carClass, int weight, Engine engine, Person driver) {
		this.carClass = carClass;
		this.engine = engine;
		this.driver = driver;
		this.marka = marka;
		this.weight = weight;
	}
		
		public void start() {
			System.out.println("Поехали");
		}
		public void stop() {
			System.out.println("Останавливаемся");

		}
		public void turnRight() {
			System.out.println("Поворот направо");

		}
		public void turnLeft() {
			System.out.println("Поворот налево");

		}

		@Override
		public String toString() {
			return "Car: marka=" + marka + ", carClass=" + carClass + ", weight=" + weight + ", driver=" + driver.getFullName() + " | " + driver.getAge() + " age |" + driver.getExperience() + " y. exp,"
					+ " engine=" + engine.getPower() +  " | " + engine.getManufacturer();
		}
		
		public void printInfo(){
			System.out.println(toString());
		}
}
