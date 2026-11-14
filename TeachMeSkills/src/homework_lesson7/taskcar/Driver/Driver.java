package homework_lesson7.taskcar.Driver;

/* Описание (2026): Водитель в задаче про автомобили: ФИО и стаж вождения с геттерами/сеттерами. Является родителем класса Person. */
public class Driver {
	private int experience;
	private String fullName;
	
		public Driver(int experience, String fullName) {
			this.experience = experience;
			this.fullName = fullName;
		}
		
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		@Override
		public String toString() {
			return "Driver [experience=" + experience + "]";
		}
		

}
