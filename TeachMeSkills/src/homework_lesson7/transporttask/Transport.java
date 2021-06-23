package homework_lesson7.transporttask;

public class Transport {
private int power;
private int maxspeed;
private int weight;
private String label;

	public Transport(int power, int maxspeed, int weight, String label) {
		this.power = power;
		this.maxspeed = maxspeed;
		this.weight = weight;
		this.label = label;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Transport [power=" + power + ", maxspeed=" + maxspeed + ", weight=" + weight + ", label=" + label + "]";
	}
}
