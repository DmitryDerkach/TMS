package homework_lesson8.taskrobot.Legs;

/* Описание (2026): Интерфейс ноги робота: step() (шагнуть) и getPrice(). Реализуется SamsungLeg, SonyLeg, ToshibaLeg. */
public interface ILeg {
	void step();
    int getPrice();
}
