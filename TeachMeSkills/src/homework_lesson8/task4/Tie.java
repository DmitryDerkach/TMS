package homework_lesson8.task4;

public class Tie extends Clothes implements MensClothes{

    public Tie (int size, int cost, String color,String name) {
        super(size, cost, color,name);
    }
    @Override
    public void dressMen() {
        System.out.println("Мужчина c галстуком");
    }
}
