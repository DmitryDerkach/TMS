package homework_lesson8.tasktool;

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
