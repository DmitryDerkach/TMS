package homework_lesson8.taskclothes;

/* Описание (2026): Юбка - только женская одежда: наследует Clothes и реализует WomanCloth. Метод одевания - пустая заглушка, toString() дописывает тип вещи. */
public class Skirt extends Clothes implements WomanCloth {

	public Skirt(ClothesSize size, int cost, String color) {
		super(size, cost, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressUpWoman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() + "Skirt []";
	}
	
	

}
