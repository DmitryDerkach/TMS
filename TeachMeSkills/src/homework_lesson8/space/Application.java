package homework_lesson8.space;

/* Описание (2026): Запуск шаттла с космодрома "Байконур": Spaceport получает аппарат через интерфейс IStart и вызывает launch() - предстартовая проверка, запуск двигателей, обратный отсчёт 10..1 и старт. */
public class Application {
public static void main(String[] args) {
	Spaceport baikonur = new Spaceport(new Shuttle());
	Shuttle sh1 = (Shuttle)baikonur.getIst();
	baikonur.launch(sh1);
}
}
