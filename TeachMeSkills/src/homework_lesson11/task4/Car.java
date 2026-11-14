package homework_lesson11.task4;

import java.io.Serializable;

/* Описание (2026): модель автомобиля (марка, скорость, цена) для task4; реализует Serializable, чтобы объекты можно было записывать в файл и читать обратно. */
public class Car implements Serializable{
	private String label;
	private int speed;
	private int cost;
	
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

	@Override
	public String toString() {
		return "Car [label=" + label + ", speed=" + speed + ", cost=" + cost + "]";
	}
	
}
