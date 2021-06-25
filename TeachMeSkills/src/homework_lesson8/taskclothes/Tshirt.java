package homework_lesson8.taskclothes;

public class Tshirt extends Clothes implements ManCloth, WomanCloth {

	public Tshirt(ClothesSize size, int cost, String color) {
		super(size, cost, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressUpMen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dressUpWoman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() + "Tshirt []";
	}
	

}
