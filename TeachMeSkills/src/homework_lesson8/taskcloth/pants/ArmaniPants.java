package homework_lesson8.taskcloth.pants;

/* Описание (2026): Штаны Armani - реализация интерфейса Pants с ценой; при надевании/снятии выводит соответствующее сообщение. */
public class ArmaniPants implements Pants{
	private int priece;
	
	public int getPriece() {
		return priece;
	}
	public void setPriece(int priece) {
		this.priece = priece;
	}
	@Override
	public void dressUpPants() {
		System.out.println("Надеты штаны от Армани"); 
		
	}
	@Override
	public void dressDownPants() {
		System.out.println("Сняты штаны от Армани");
	}
}
