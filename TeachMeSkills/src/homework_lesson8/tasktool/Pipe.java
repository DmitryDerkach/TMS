package homework_lesson8.tasktool;

/* Описание (2026): Труба - реализация Tool с диаметром; play() выводит, что играет труба указанного диаметра. */
public class Pipe implements Tool {
	private int diametr;
	
		Pipe(int d){
			diametr = d;
		}

	@Override
	public void play() {
				System.out.println("Играет труба c диаметром " + diametr);
	}
}
