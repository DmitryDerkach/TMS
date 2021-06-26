package homework_lesson8.taskcloth.pants;

public class GucciPants implements Pants{
	private int priece;
	
	public int getPriece() {
		return priece;
	}
	public void setPriece(int priece) {
		this.priece = priece;
	}
	@Override
	public void dressUpPants() {
		System.out.println("Надеты штаны от Гучи");
	}
	@Override
	public void dressDownPants() {
		System.out.println("Сняты штаны от Гучи");
	}
}
