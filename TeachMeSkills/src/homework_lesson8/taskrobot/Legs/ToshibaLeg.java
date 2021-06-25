package homework_lesson8.taskrobot.Legs;

public class ToshibaLeg implements ILeg{

	@Override
	public void step() {
		System.out.println("Шаг ногой Тошиба");
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 700;
	}

}
