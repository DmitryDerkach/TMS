package homework_lesson5.taskphone;

public class Phone {
private	int number;
private	String model;
private	int weight;

public Phone(int number, String model) {
	this.number = number;
	this.model = model;
}
//public Phone(int number, String model, int weight) {
//	this.number = number;
//	this.model = model;
//	this.weight = weight;	
//}

public Phone(int number, String model, int weight) { //Вызов конструктора с 2-мя параметрами
	this(number, model);
	this.weight = weight;	
}

public Phone() {
	
}

public void setNumber(int number){
	this.number = number; 
}	
public int getNumber() {
	return number;
}

public void setModel(String model){
	this.model = model; 
}	

public String getModel() {
	return model;
}

public void setWeight(int mass){
	weight = mass; 
}	
public int getWeight() {
	return number;
}

public void getInfo() {
	System.out.printf("Number: %d \nModel: %s \nWeight: %d \n", number,model,weight);
	System.out.println();
}	

public void reciveCall(String name) {
	System.out.println(name + " is calling");
}	

public void reciveCall(String name, int number) {
	System.out.print(name + " is calling. ");
	System.out.println("Number is " + number);
}	

public void sendMessage (int ... number) {
    for (int i: number) {
        System.out.println("Message to the number " + i);
    }
}





}
