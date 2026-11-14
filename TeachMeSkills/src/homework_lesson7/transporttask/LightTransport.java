package homework_lesson7.transporttask;

/* Описание (2026): Легковой автомобиль - наследник LandTransport с типом кузова и числом пассажиров; additionalinfo(time) печатает, сколько км он проедет за заданное время на максимальной скорости и сколько израсходует топлива. */
public class LightTransport extends LandTransport{
	private String bodytype;
	private int numofpassangers;
	
	public LightTransport(int power, int maxspeed, int weight, String label, int wheelnum, int fuelconsumptionrate,
			String bodytype, int numofpassangers) {
		super(power, maxspeed, weight, label, wheelnum, fuelconsumptionrate);
		this.bodytype = bodytype;
		this.numofpassangers = numofpassangers;
	}

	public String getBodytype() {
		return bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public int getNumofpassangers() {
		return numofpassangers;
	}

	public void setNumofpassangers(int numofpassangers) {
		this.numofpassangers = numofpassangers;
	}

	@Override
	public String toString() {
		return super.toString() +  "LightTransport [bodytype=" + bodytype + ", numofpassangers=" + numofpassangers + "]";
	}
	
	public void additionalinfo(double time) {
		double s = this.calaculation(time);
		double totalway = time * getMaxspeed();
		System.out.println("За время " + time + "ч, автомобиль марки " + getLabel() + " двигаясь с максимальной скоростью " + getMaxspeed() + " проедет " + totalway + 
				" и израсходует " + s + " литров топлива" );
	}
	
	private double calaculation(double time) {
		double supnum = (double)getFuelconsumptionrate() * time; /*кол-во израсходуемого топлива*/
		return supnum;
	}
	
	
}	

