package homework_lesson7.taskshape;

public class Circle extends Shape {
	private int rad;
	private int centx;
	private int centy;
	
		public Circle(String color, int rad, int centx, int centy) {
			super(color);
			this.rad = rad;
			this.centx = centx;
			this.centy = centy;
		}

		public void draw() {
			System.out.println("Рисуем круг радиусом " + rad + " с кординатами центра: X " + centx + " Y " + centy + ".\nЦвет: " + getColor());
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + centx;
			result = prime * result + centy;
			result = prime * result + rad;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Circle other = (Circle) obj;
			if (centx != other.centx)
				return false;
			if (centy != other.centy)
				return false;
			if (rad != other.rad)
				return false;
			return true;
		}
}
