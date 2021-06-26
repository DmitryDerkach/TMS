package homework_lesson8.space;

public class Application {
public static void main(String[] args) {
	Spaceport baikonur = new Spaceport(new Shuttle());
	Shuttle sh1 = (Shuttle)baikonur.getIst();
	baikonur.launch(sh1);
}
}
