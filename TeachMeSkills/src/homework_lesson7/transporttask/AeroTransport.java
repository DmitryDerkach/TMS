package homework_lesson7.transporttask;

/* Описание (2026): Воздушный транспорт - наследник Transport с размахом крыльев и минимальной длиной взлетной полосы; родитель для CivilAeroTransport и MilitaryAeroTransport. */
public class AeroTransport extends Transport {
	private int wingsize;
	private int minairstripcapacity;
	
	public AeroTransport(int power, int maxspeed, int weight, String label, int wingsize, int minairstripcapacity) {
		super(power, maxspeed, weight, label);
		this.wingsize = wingsize;
		this.minairstripcapacity = minairstripcapacity;
	}

	public int getWingsize() {
		return wingsize;
	}

	public void setWingsize(int wingsize) {
		this.wingsize = wingsize;
	}

	public int getMinairstripcapacity() {
		return minairstripcapacity;
	}

	public void setMinairstripcapacity(int minairstripcapacity) {
		this.minairstripcapacity = minairstripcapacity;
	}

	@Override
	public String toString() {
		return super.toString() + "AeroTransport [wingsize=" + wingsize + ", minairstripcapacity=" + minairstripcapacity + "]";
	}	
	
}
