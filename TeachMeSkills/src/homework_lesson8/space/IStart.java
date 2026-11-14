package homework_lesson8.space;

/* Описание (2026): Интерфейс запускаемого космического аппарата: предстартовая проверка систем, запуск двигателей и старт. Позволяет космодрому (Spaceport) работать с любым аппаратом через общий тип. */
public interface IStart {
	public boolean systemCheck();
	public void engineStart();
	public void start();
}
