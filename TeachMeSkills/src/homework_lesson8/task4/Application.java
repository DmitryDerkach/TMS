package homework_lesson8.task4;

public class Application {
	   public static void main(String[] args) {
	        Clothes pants = new Pants(36,200,"Black","Pants");
	        Clothes tshirt = new Tshirt(38,50,"Red","T-shirt");
	        Clothes skirt = new Skirt(34,90,"Blue","Skirt");
	        Clothes tie = new Tie(40,30,"Brown","Tie");
	        Clothes [] clothes = {pants,tshirt,skirt,tie};
	        (new Atelier()).dressWomen(clothes);
	        System.out.println();
	        (new Atelier()).dressMen(clothes);

	        ((Pants)pants).dressMen();
	        ((Skirt)skirt).dressWomen();
	    }
	}
