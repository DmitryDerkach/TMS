package homework_lesson8.tasktool;

/* Описание (2026): Гитара - реализация Tool с количеством струн; play() выводит, что играет гитара с указанным числом струн. */
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
