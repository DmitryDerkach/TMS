package homework_lesson8.tasktool;

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
