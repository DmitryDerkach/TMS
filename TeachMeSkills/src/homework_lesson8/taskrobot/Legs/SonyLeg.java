package homework_lesson8.taskrobot.Legs;

public class SonyLeg implements ILeg{

	@Override
	public void step() {
		System.out.println("Шаг ногой Сони");
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 500;
	}

}
