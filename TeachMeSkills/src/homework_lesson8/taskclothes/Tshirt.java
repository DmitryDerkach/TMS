package homework_lesson8.taskclothes;

/* Описание (2026): Футболка - одежда унисекс: наследует Clothes и реализует и ManCloth, и WomanCloth. Методы одевания - пустые заглушки, toString() дописывает тип вещи. */
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
