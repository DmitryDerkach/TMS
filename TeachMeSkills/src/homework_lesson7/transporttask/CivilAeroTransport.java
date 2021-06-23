package homework_lesson7.transporttask;

public class CivilAeroTransport extends AeroTransport {
	private int numofpassangers;
	private boolean buisnessclassaviability;
	
	public CivilAeroTransport(int power, int maxspeed, int weight, String label, int wingsize,
			int minairstripcapacity, int numofpassangers, boolean buisnessclassaviability) {
		super(power, maxspeed, weight, label, wingsize, minairstripcapacity);
		this.numofpassangers = numofpassangers;
		this.buisnessclassaviability = buisnessclassaviability;
	}

	public int getNumofpassangers() {
		return numofpassangers;
	}

	public void setNumofpassangers(int numofpassangers) {
		this.numofpassangers = numofpassangers;
	}

	public boolean isBuisnessclassaviability() {
		return buisnessclassaviability;
	}

	public void setBuisnessclassaviability(boolean buisnessclassaviability) {
		this.buisnessclassaviability = buisnessclassaviability;
	}

	@Override
	public String toString() {
		return super.toString() + "CivilAeroTransport [numofpassangers=" + numofpassangers + ", buisnessclassaviability="
				+ buisnessclassaviability + "]";
	}
	
}
