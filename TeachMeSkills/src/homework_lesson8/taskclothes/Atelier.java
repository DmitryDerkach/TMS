package homework_lesson8.taskclothes;

public class Atelier implements ManCloth, WomanCloth{
	private Clothes [] cl = null;
	@Override
	public void dressUpWoman() {
		supmethodforwowan();
		
	}
		private void supmethodforwowan(Clothes [] arrayofcloth) {
			cl = arrayofcloth;
			System.out.println("Доступаня женская одежда:");
			for (int i = 0; i < cl.length; i++) {
				if ((cl[i] instanceof Skirt) || (cl[i] instanceof Pants) || (cl[i] instanceof Tshirt)) {
					cl.toString();
				}
			}
		}

	@Override
	public void dressUpMen() {
		// TODO Auto-generated method stub
		
	}	
}
	

