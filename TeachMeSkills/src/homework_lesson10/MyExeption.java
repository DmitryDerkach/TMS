package homework_lesson10;

/* Описание (2026): Пользовательское проверяемое исключение (наследник Exception), которое бросает Car.start(), когда машина не завелась; toString() возвращает текст ошибки. */
public class MyExeption extends Exception {
	@Override
	public String toString() {
		return "Машина не звелась";
	}

}
