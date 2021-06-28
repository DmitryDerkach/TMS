package homework_lesson10;

import java.util.Random;

public class Car {
	private String label;
	private int speed;
	private int cost;
		
		public Car() {
			
		}
		public Car(String label, int speed, int cost) {
			this.label = label;
			this.speed = speed;
			this.cost = cost;
		}
		
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public void start() throws MyExeption {
			Random r = new Random();
			int a = r.nextInt(21);
				if (a % 2 == 0) {
					throw new MyExeption();
				} else {
					System.out.println("Машина марки " + label + " упешно завелась");
				}
		}
}
