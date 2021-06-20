package homework_lesson6.taskreader;

public enum PhoneNum {
	NUM1(111-11-11),
	NUM2(222-22-22),
	NUM3(333-33-33);
	private int num;	
	PhoneNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
