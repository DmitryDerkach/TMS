package homework_lesson7.taskshop;
import java.util.*;
public class Application {
public static void main(String[] args) {
	/*Создаем парочку наименований*/
	Product pr1 = new Product("Велосипед", 300, 4.2);
	Product pr2 = new Product("Самокат", 700, 5.0);
	Product pr3 = new Product("Носки", 5, 4.7);
	Product pr4 = new Product("Пена для бритья", 10, 3.6);
	/*Создаем 2 массива, которые понадобятся нам дальше*/
	Product [] arr1 = {pr1, pr2};
	Product [] arr2 = {pr3, pr4};
	Product [] arr3 = new Product[arr1.length + arr2.length];
	/*Создаем каталоги*/
	Cathegory cat1 = new Cathegory("Товары для спорта", arr1);/*String chategoryname, Product[] product*/
	Cathegory cat2 = new Cathegory("Товары для мужчин", arr2);
	/*Создаем обращение к пользователю*/
	User us1 = new User("Dima228", "PepeClap", new Basket(arr3,0));
	us1.printInfo();
	System.out.println("Пожалуйста, просмотрите каталог наших товаров: ");
	cat1.printProducts();
	cat2.printProducts();
	System.out.print("Пожалуйста, наберите порядковый номер товара(товаров), который(которые)е вы хотите купить(в случае, если товаров несколько, вводите их "
			+ "через запятую): ");
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	char[] suparr = new char[7];
	a.getChars(0, a.length(), suparr, 0);
		for (int i = 0; i < suparr.length; i++) {
			switch (suparr[i]) {
				case('1'):{
					us1.wantToBuy(pr1);
					break;
				}
				case('2'):{
					us1.wantToBuy(pr2);
					break;
				}
				case('3'):{
					us1.wantToBuy(pr3);
					break;
				}
				case('4'):{
					us1.wantToBuy(pr4);
					break;
				}	
			}
		}
	us1.displayBasket();	
	}
}
