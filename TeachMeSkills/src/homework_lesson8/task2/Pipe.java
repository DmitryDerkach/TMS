package homework_lesson8.task2;

public class Pipe implements Instrument{/*Труба содержит переменную класса "Диаметр"*/
	    private int diameter;

	    public Pipe(int diameter) {
	        this.diameter = diameter;
	    }

	    public int getDiameter() {
	        return diameter;
	    }

	    public void setDiameter(int diameter) {
	        this.diameter = diameter;
	    }

	    @Override
	    public void play() {
	        System.out.printf("Играет тура, диаметр: %d\n",diameter);
	    }
}
