package homework_lesson7.taskstudent;

public class Aspirant extends Student {
	
	private String scienceWork;
	
	public Aspirant(String firstName, String lastName, int group, double averageMark,String scienceWork){
        super(firstName,lastName,group,averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

	@Override
	public int getScholarship() {
		int money = 0;
		if (super.averagemark == 5) {
			money = 200;
			return money;
		} else {
			money = 180;
			return money;
		}
	}
    
    
    
    
}
