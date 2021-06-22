package homework_lesson7.taskshape;
/*+*/
public abstract class Shape {
	private String color;
	
		Shape(String color){
			this.color = color;
		}

		public String getColor() {
			return color;
		}
		public abstract void draw();
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Shape other = (Shape) obj;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			return true;
		}	
}
