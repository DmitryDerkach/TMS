package homework_lesson8.taskcloth.jacket;

/* Описание (2026): Куртка Gucci - реализация интерфейса Jacket с ценой; при надевании/снятии выводит соответствующее сообщение. */
public class GucciJacket implements Jacket {
	private int priece;
	
	public int getPriece() {
		return priece;
	}
	public void setPriece(int priece) {
		this.priece = priece;
	}
	@Override
	public void dressUpJacket() {
		System.out.println("Надета куртка от Гучи");	
	}
	@Override
	public void dressDownJacket() {
		System.out.println("Снята курта от Гучи");
	}
}
