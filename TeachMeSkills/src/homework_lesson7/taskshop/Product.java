package homework_lesson7.taskshop;

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
