package homework_lesson8.taskclothes;

/* Описание (2026): Перечисление размеров одежды XXS..L с европейским размером (32-40) в конструкторе. Для XXS метод getDescription() переопределён в теле константы ("Детский размер"), для остальных возвращает "Взрослый размер". */
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
