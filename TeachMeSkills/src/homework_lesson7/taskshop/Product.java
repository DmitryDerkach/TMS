package homework_lesson7.taskshop;

/* Описание (2026): Товар в задаче про магазин: название, цена и рейтинг, с переопределенным toString для вывода в каталоге и корзине. */
public class Product {
	private String name;
	private int price;
	private double rating;
	
		public Product(String name, int price, double rating) {
			this.name = name;
			this.price = price;
			this.rating = rating;
		}

		public String getName() {
			return name;
		}
		@Override
		public  String toString() {
			return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
		}
}
