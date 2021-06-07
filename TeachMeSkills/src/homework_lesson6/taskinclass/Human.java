package homework_lesson6.taskinclass;

public class Human {

	private String name;        /*Поля*/
	private int age;         
	private int weight;
	private int height;
	private Ability skill;
	
public Human () {        /*Конструктор №1*/
        weight = 60;
        height = 180;
    }

public Human (String name) {   /*Конструктор №2*/
    this.name = name;
    weight = 60;
    height = 180;
    }
	
public Human (Ability parametr) { /*Конструктор 3*/
    skill = parametr;
}

public void setAbility (Ability parametr) {     /*Распишем геттеры и сеттеры*/
    skill = parametr;
}

public Ability getAbility () {
    return skill;
}	

public void setName (String name) {
    this.name = name;
}

public String getName () {
    return name;
}
	
public void setAge (int age) {
    if (age<18) {
        System.out.println("Ты еще маленький!");
    } else {
        this.age = age;
    }
}

public int getAge () {
    return age;
}

private double bodyIndex ()  {
    return (double) weight / height;
}
	
public void showInfo () {
    System.out.printf("Name is %s, age is %d, weight is %d, height is %d, weight index is %f", name, age, weight, height, bodyIndex());
    System.out.println(skill.getName());	
	}

}
