package homework_lesson7.transporttask;

/* Описание (2026): Грузовой транспорт - наследник LandTransport с грузоподъемностью. */
public class FreightTransport extends LandTransport {
	private int carryingcapacity;

	public FreightTransport(int power, int maxspeed, int weight, String label, int wheelnum, int fuelconsumptionrate,
			int carryingcapacity) {
		super(power, maxspeed, weight, label, wheelnum, fuelconsumptionrate);
		this.carryingcapacity = carryingcapacity;
	}

	public int getCarryingcapacity() {
		return carryingcapacity;
	}

	public void setCarryingcapacity(int carryingcapacity) {
		this.carryingcapacity = carryingcapacity;
	}

	@Override
	public String toString() {
		return super.toString() + "FreightTransport [carryingcapacity=" + carryingcapacity + "]";
	}
}
