package homework_lesson7.transporttask;

/* Описание (2026): Наземный транспорт - наследник Transport с количеством колес и расходом топлива; родитель для LightTransport и FreightTransport. */
public class LandTransport extends Transport{
	private int wheelnum;
	private int fuelconsumptionrate;
	
	public LandTransport(int power, int maxspeed, int weight, String label, int wheelnum, int fuelconsumptionrate) {
		super(power, maxspeed, weight, label);
		this.wheelnum = wheelnum;
		this.fuelconsumptionrate = fuelconsumptionrate;
	}

	public int getWheelnum() {
		return wheelnum;
	}

	public void setWheelnum(int wheelnum) {
		this.wheelnum = wheelnum;
	}

	public int getFuelconsumptionrate() {
		return fuelconsumptionrate;
	}

	public void setFuelconsumptionrate(int fuelconsumptionrate) {
		this.fuelconsumptionrate = fuelconsumptionrate;
	}

	@Override
	public String toString() {
		return super.toString() + "LandTransport [wheelnum=" + wheelnum + ", fuelconsumptionrate=" + fuelconsumptionrate + "]";
	}
}
