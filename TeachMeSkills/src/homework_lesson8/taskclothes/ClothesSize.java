package homework_lesson8.taskclothes;

public enum ClothesSize {
XXS(32){
	public String getDescription(){
		return "Детский размер";
	}
},
XS(34),
S(36),
M(38),
L(40);
	
private int eurosize;
	private ClothesSize(int size) {
		eurosize = size;
	}

	public String getDescription() {
		return "Взрослый размер";
	}
}
