package homework_lesson8.task4;

public class Atelier {
    //private Clothes [] clothes;
    public void dressMen (Clothes [] clothes){
        System.out.println("Мужская одежда:");
        for(Clothes i: clothes){
            if (i instanceof MensClothes){
                i.printInfo();
            }
        }
    }
    public void dressWomen (Clothes [] clothes){
        System.out.println("Женская одежда:");
        for(Clothes i: clothes){
            if (i instanceof WomensClothes){
                i.printInfo();
            }
        }
    }
}
