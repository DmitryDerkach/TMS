package homework_lesson8.tasktool;

public class Guitar implements Tool {
	private int numofstrunes;
		
		Guitar(int a){
			numofstrunes = a;
		}

	@Override
	public void play() {
		System.out.println("Играет гитара c кол-вом струн равным " + numofstrunes);
	}
}
