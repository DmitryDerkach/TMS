package homework_lesson8.taskcloth.shoes;

public class GucciShoes implements Shoes {
	private int priece;
	
	public int getPriece() {
		return priece;
	}
	public void setPriece(int priece) {
		this.priece = priece;
	}
	@Override
	public void dressUpShoes() {
		System.out.println("Надета обувь от Гучи");
	}
	@Override
	public void dressDownShoes() {
		System.out.println("Снята обувь от Гучи");
	}
}
