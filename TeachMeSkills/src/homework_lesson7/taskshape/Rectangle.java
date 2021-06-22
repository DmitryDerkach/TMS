package homework_lesson7.taskshape;

public class Rectangle extends Shape{
	private int centerx;
	private int centery;
	private int width;
	private int length;
	
		public Rectangle(String color, int centx, int centy, int width, int length) {
			super(color);
			centerx = centx;
			centery = centy;
			this.width = width;
			this.length = length;
		}
		
	public void draw() {
		System.out.println("Рисуем прямоугольник длинной " + length + " шириной " + width + " с кординатами центра: X " + centerx + " Y " + centery +
				".\nЦвет: " + getColor());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + centerx;
		result = prime * result + centery;
		result = prime * result + length;
		result = prime * result + width;
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
		Rectangle other = (Rectangle) obj;
		if (centerx != other.centerx)
			return false;
		if (centery != other.centery)
			return false;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
}
