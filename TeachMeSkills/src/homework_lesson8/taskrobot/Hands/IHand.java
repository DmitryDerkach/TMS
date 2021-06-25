package homework_lesson8.taskrobot.Hands;

public interface IHand {
	default void upHand() {
		System.out.println("Рука подымается");
	}
	int getPrice();

}
