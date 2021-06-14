package homework_lesson8.task3;

public class App {
	   public static void main(String[] args) {
	        Seasons season = Seasons.WINTER;
	        season.printInfo();
	        season.iLove(Seasons.AUTUMN);
	        Seasons.SUMMER.getDescription();

	        Seasons [] arr = Seasons.values();
	        for(Seasons i : arr){
	            System.out.println();
	            i.printInfo();
	            i.getDescription();
	        }
	    }
	}

