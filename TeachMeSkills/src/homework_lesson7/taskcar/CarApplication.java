package homework_lesson7.taskcar;

import homework_lesson7.taskcar.Car.Car;
import homework_lesson7.taskcar.Car.Lorry;
import homework_lesson7.taskcar.Driver.Person;
import homework_lesson7.taskcar.Engine.Engine;
import homework_lesson7.taskcar.Car.SportCar;

public class CarApplication {
	public static void main(String[] args) {
		Engine en1 = new Engine (450, "Boing");
		Engine en2 = new Engine (300, "Porche");
		Engine en3 = new Engine (500, "Ford");
		
		Person dr1 = new Person ("Ivanov Ivan Ivanovich"/*fullname*/, 26/*exp*/, 50/*age*/);
		Person dr2 = new Person ("Borisov Boris Borisovich"/*fullname*/, 13/*exp*/, 33/*age*/);
		Person dr3 = new Person ("Dimonov Dmitry Dmitrievich"/*fullname*/, 15/*exp*/, 37/*age*/);
		
		
		Car car1 = new Car ("Audi", "Premium", 4000, en2, dr1);/*String marka, String carClass, int weight, Engine engine, Driver driver*/
		car1.printInfo();
		
		Car car2 = new Lorry("Man", "Budget", 18000, en1, dr2, 4000);
		car2.printInfo();
		
		Car car3 = new SportCar("Ford", "Premium", 2700, en3, dr3, 320);
		car3.printInfo();
	
	}
}
