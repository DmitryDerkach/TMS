package homework_lesson8.task3;

public enum Seasons {/*Создали перечисление, содержащее название времен года*/
	    AUTUMN("Autumn","+8"), /*Перечисление содержит переменную, содержащую ср. температруру в каждом времени года*/
	    WINTER("Winter","-15"),/*Не можем убрать значени в скобках, из=-за ошибки*/
	    SPRING("Spring","+15"),
	  	SUMMER("Summer","+25"){
	        @Override
	        public void getDescription (){
	            System.out.println("Warm time of the year");
	        }
	    };

	    String season;
	    String temperature;

	    Seasons(String season,String temperature){ /*Добавляем конструктор принимающий на вход ср. температуру*/
	        this.season = season;
	        this.temperature = temperature;
	    }
	    public String getSeason() {
	        return season;
	    }
	    public String getTemperature() {
	        return temperature;
	    }

	    public void printInfo(){
	        System.out.println(season + " " + temperature);
	        System.out.println();
	    }
	    public void iLove (Seasons season){/*Создали метод, который принимает на вход переменную созданного иною enum типа. 
Если значение равно "Лето", выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.*/
	        //System.out.println("I love " + getSeason());

	        System.out.print("I love ");
	        switch (season){
	            case AUTUMN:
	                System.out.println("Autumn");
	                break;
	            case WINTER:
	                System.out.println("Winter");
	                break;
	            case SPRING:
	                System.out.println("Spring");
	                break;
	            case SUMMER:
	                System.out.println("Summer");
	                break;
	        }
	    }
	    public void getDescription (){
	        System.out.println("Cold time of the year");
	    }
	}