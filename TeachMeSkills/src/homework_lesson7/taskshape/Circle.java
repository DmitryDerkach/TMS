package homework_lesson7.taskshape;

public class Circle extends Shape {
	private int rad;
	
		public Circle(String color, int rad) {
			super(color);
			this.rad = rad;
		}

		public void draw() {
			System.out.println("Рисуем " + super.getColor() + " круг c радиусом " + rad);
		}

}
