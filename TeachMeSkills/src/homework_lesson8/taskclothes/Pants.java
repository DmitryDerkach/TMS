package homework_lesson8.taskclothes;

/* Описание (2026): Брюки - одежда унисекс: наследуют Clothes и реализуют и ManCloth, и WomanCloth, поэтому попадают в оба списка ателье. Методы одевания - пустые заглушки, toString() дописывает тип вещи. */
public class Pants extends Clothes implements ManCloth, WomanCloth {

	public Pants(ClothesSize size, int cost, String color) {
		super(size, cost, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressUpWoman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dressUpMen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() + "Pants []";
	}
	
	

}
