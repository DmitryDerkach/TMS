package homework_lesson6.taskinclass;

/* Описание (2026): Модель "способность" для классной задачи: хранит название навыка (геттер/сеттер) и выводит его методом displayAbility. Используется как поле-объект в классе Human (композиция). */
public class Ability {
	
private String name;	

public void setName (String name) {
        this.name = name;
   }

public String getName() {
    return name;
}

public void displayAbility () {
    System.out.printf("Ability is %s", name);
    }

}
