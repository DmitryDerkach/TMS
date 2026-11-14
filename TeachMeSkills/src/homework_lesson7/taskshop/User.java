package homework_lesson7.taskshop;

/* Описание (2026): Пользователь магазина: логин, пароль и своя корзина Basket; wantToBuy кладет товар в корзину, displayBasket показывает ее, printInfo выводит логин. */
public class User {
	private String login;
	private String password;
	private Basket userbasket;
	public User(String login, String password, Basket userbasket) {
		this.login = login;
		this.password = password;
		this.userbasket = userbasket;
	}
	public void printInfo(){
		System.out.println("Пользователь зашел под логином: " + login);
		if (password != null) {
			System.out.println("Пароль идентифицирован"); 
		}
	}
	public void wantToBuy(Product p) {                
		userbasket.getProductintoBasket(p);												
	}
	public void displayBasket() {
		userbasket.displayBasket();
	}
}

