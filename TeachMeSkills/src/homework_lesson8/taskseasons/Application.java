package homework_lesson8.taskseasons;

/* Описание (2026): Задача "Времена года": перебирает все значения enum Seasons, выводя описание сезона со средней температурой и пометку "тёплое/холодное время года", затем через switch печатает "Я люблю весну". */
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
