package homework_lesson7.taskshop;

/* Описание (2026): Корзина покупок в задаче про магазин: массив купленных товаров со счетчиком; getProductintoBasket добавляет товар, displayBasket выводит все непустые позиции. */
public class Basket  {
	private Product [] boughtproduct = new Product[10];
	private int counter = 0;

		public Basket(Product[] boughtproduct, int counter) {
			this.boughtproduct = boughtproduct;
			this.counter = counter;
		}
		
	public void displayBasket() {
		System.out.println("Ваша корзина");
		for (Product p : boughtproduct) {
			if (p == null) {
				continue;
			}
			System.out.println(p + " ");
		}
	}
	public void getProductintoBasket(Product p) {
		boughtproduct[counter] = p;
		counter +=1;
		System.out.println("Продукт успешно добавлен в корзину");
	}
	
}
