package homework_lesson6.taskreader;

public enum PhoneNum {
	NUM1("111-11-11"),
	NUM2("222-22-22"),
	NUM3("333-33-33");
	private String num;	
	private String t;
	PhoneNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	public String getNum(int loopnumber) {
		switch (loopnumber) {
		case(0):{
			t = PhoneNum.NUM1.getNum();	
			break;
		}
		case(1):{
			t = PhoneNum.NUM2.getNum();		
			break;
		}
		case(2):{
			t = PhoneNum.NUM3.getNum();		
			break;
		}
		default:{
			System.out.println("Что-то пошло не так...");
		}
		}
		return t;
	}
}
