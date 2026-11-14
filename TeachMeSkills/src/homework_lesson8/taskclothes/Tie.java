package homework_lesson8.taskclothes;

/* Описание (2026): Галстук - только мужская одежда: наследует Clothes и реализует ManCloth. Метод одевания - пустая заглушка, toString() дописывает тип вещи. */
public class Tie extends Clothes implements ManCloth{

	public Tie(ClothesSize size, int cost, String color) {
		super(size, cost, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressUpMen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() +  "Tie []";
	}
	
	

}
