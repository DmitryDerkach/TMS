package homework_lesson7.transporttask;

public class MilitaryAeroTransport extends AeroTransport {
	private boolean catapultsystemavaiability;
	private int numofrocketsavaiable;
	
	public MilitaryAeroTransport(int power, int maxspeed, int weight, String label, int wingsize,
			int minairstripcapacity, boolean catapultsystemavaiability, int numofrocketsavaiable) {
		super(power, maxspeed, weight, label, wingsize, minairstripcapacity);
		this.catapultsystemavaiability = catapultsystemavaiability;
		this.numofrocketsavaiable = numofrocketsavaiable;
	}

	public boolean isCatapultsystemavaiability() {
		return catapultsystemavaiability;
	}

	public void setCatapultsystemavaiability(boolean catapultsystemavaiability) {
		this.catapultsystemavaiability = catapultsystemavaiability;
	}

	public int getNumofrocketsavaiable() {
		return numofrocketsavaiable;
	}

	public void setNumofrocketsavaiable(int numofrocketsavaiable) {
		this.numofrocketsavaiable = numofrocketsavaiable;
	}

	@Override
	public String toString() {
		return super.toString() + "MilitaryAeroTransport [catapultsystemavaiability=" + catapultsystemavaiability
				+ ", numofrocketsavaiable=" + numofrocketsavaiable + "]";
	}
	
	
}
