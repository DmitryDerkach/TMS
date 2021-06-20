package homework_lesson6.taskreader;

public enum Birthday {
	BIRTDAY1(01-06-98),
	BIRTDAY2(01-06-97),
	BIRTDAY3(01-06-96);
	private int dates;	
	Birthday(int i) {
		dates = i;
	}
	public int getBirtday() {
		return dates;
	}
}
