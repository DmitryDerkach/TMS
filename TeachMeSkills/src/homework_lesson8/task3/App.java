package homework_lesson8.task3;

public class App {
	   public static void main(String[] args) {
		   
Seasons season = Seasons.WINTER;/*Создали переменную, содержащуюю мое любимое время года и всю информацию о нем*/
season.printInfo();
	        
  season.iLove(Seasons.AUTUMN);
  season.iLove(Seasons.WINTER);
  season.iLove(Seasons.SUMMER);
  season.iLove(Seasons.SPRING);
//	        Seasons.SUMMER.getDescription();

	        Seasons [] arr = Seasons.values(); /*Автоматически предопределенный метод для перечисления
	        values() возвращает массив, содержащий список констант перечисления*/
	        for(Seasons i : arr){
	            System.out.println();
	            i.printInfo();
	            i.getDescription();
	        }
	    }
	}

