package homework_lesson7.taskshop;

/* Описание (2026): Категория товаров в задаче про магазин: название и массив Product; printProducts выводит все товары категории. */
public class Cathegory {
private String chategoryname;
private Product [] product;

	public Cathegory(String chategoryname, Product[] product) {
		this.chategoryname = chategoryname;
		this.product = product;
	}
	public void printProducts() {
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i].toString());
		}
	}
}
