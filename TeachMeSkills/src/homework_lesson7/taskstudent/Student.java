package homework_lesson7.taskstudent;

public class Student {
	String firstname;
	String lastname;
	int group;
	double averagemark;
	
	public Student() {
		 
	    }
    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.group = group;
        this.averagemark = averageMark;
    }
    
    public int getScholarship() {
    	int money = 0;
    		if (averagemark == 5) {
    			money = 100;
    			return money;
    		} else {
    			money = 80;
    			return money;
    		}
    	
    }
    
    
    
    
    
    
    
    
    
    
}
