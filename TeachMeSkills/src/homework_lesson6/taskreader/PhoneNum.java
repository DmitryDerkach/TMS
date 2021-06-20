package homework_lesson6.taskreader;

public enum PhoneNum {
	NUM1("111-11-11"),
	NUM2("222-22-22"),
	NUM3("333-33-33");
	private String num;	
	PhoneNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
}
