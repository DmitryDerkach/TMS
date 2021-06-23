package homework_lesson7.transporttask;

public class Applicarion {
	public static void main(String[] args) {
	MilitaryAeroTransport transp1 = new MilitaryAeroTransport(700, 300, 12000, "Boing", 8, 600, true, 5);
	System.out.println(transp1.toString());
	CivilAeroTransport transp2 = new CivilAeroTransport(600, 450, 6000, "Lufthansa", 6, 600, 50, true);
	System.out.println(transp2.toString());
	LightTransport transp3 = new LightTransport(500, 200, 3000, "Audi", 4, 12, "Idontfuckingknowanytypeofcarbodytypes", 4);
	System.out.println(transp3.toString());
	FreightTransport transp4 = new FreightTransport(300, 300, 30000, "MAZ", 8, 15, 6000);
	System.out.println(transp4.toString());
		transp3.additionalinfo(2);
	
	
	}
}
