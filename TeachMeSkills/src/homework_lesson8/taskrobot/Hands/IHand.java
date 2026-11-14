package homework_lesson8.taskrobot.Hands;

/* Описание (2026): Интерфейс руки робота: default-метод upHand() ("Рука подымается") и getPrice(). Реализуется SamsungHand, SonyHand, ToshibaHand. */
public interface IHand {
	default void upHand() {
		System.out.println("Рука подымается");
	}
	int getPrice();

}
