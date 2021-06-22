package homework_lesson7.taskshape;

public class Application {
	public static void main(String[] args) {
	Shape fig1 = new Rectangle("Красный", 2, 2, 5, 10);/*String color, int centx, int centy, int width, int length*/
	Shape fig2 = new Circle("Зеленый", 7, 12, 12); /*String color, int rad, int centx, int centy)*/
		Shape [] figures = {fig1, fig2};
			for (Shape supnum: figures) {
				supnum.draw();
			}
	}
}
