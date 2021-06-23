package homework_lesson8.taskseasons;

public class Application {
public static void main(String[] args) {
	Seasons s0 = Seasons.SPRING;
	Seasons s1 = Seasons.SUMMER;
	Seasons s2 = Seasons.AUTUMN;
	Seasons s3 = Seasons.WINTER;
		Seasons [] s = {s0,s1,s2,s3};
			for (Seasons sup: s) {
				sup.getInfo();
				System.out.println(sup.getDescription());
			}
	Seasons.iLove(s0);
}
}
