package homework_lesson8.tasktool;

/* Описание (2026): Барабан - реализация Tool с размером; play() выводит, что играет барабан указанного размера. */
public class Drum implements Tool {
	private String size;

		Drum(String s){
			size = s;
		}
	@Override
	public void play() {
		System.out.println("Играет барабан c размером " + size);	
	}
}
