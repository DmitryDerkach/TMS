package homework_lesson8.taskclothes;

/* Описание (2026): Абстрактный базовый класс одежды с размером (enum ClothesSize), стоимостью и цветом; toString() выводит эти поля. От него наследуются Tie, Skirt, Tshirt и Pants. */
public abstract class Clothes {
	private ClothesSize size;
	private int cost;
	private String color;
	
		public Clothes(ClothesSize size, int cost, String color) {
			this.size = size;
			this.cost = cost;
			this.color = color;
		}

		@Override
		public String toString() {
			return "Clothes [size=" + size + ", cost=" + cost + ", color=" + color + "]";
		}
		
	
}
