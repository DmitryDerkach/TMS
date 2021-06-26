package homework_lesson8.taskcloth.jacket;

public class ArmaniJacket implements Jacket {
	private int priece;
	
	public int getPriece() {
		return priece;
	}
	public void setPriece(int priece) {
		this.priece = priece;
	}
	@Override
	public void dressUpJacket() {
		System.out.println("Одета куртка от Армани");
	}
	@Override
	public void dressDownJacket() {
		System.out.println("Снята куртка от Армани");
	}

}
