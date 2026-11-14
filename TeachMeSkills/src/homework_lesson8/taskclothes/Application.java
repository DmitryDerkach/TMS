package homework_lesson8.taskclothes;

/* Описание (2026): Задача "Ателье": создаёт массив одежды (галстук, юбка, футболка, брюки) с размером, ценой и цветом и выводит отдельно вещи, подходящие женщинам и мужчинам. Демонстрирует абстрактный класс, интерфейсы, instanceof и enum. */
public class Application {

	public static void main(String[] args) {
		Clothes cl0 = new Tie(ClothesSize.XXS, 30, "Blue"); 
		Clothes cl1 = new Skirt(ClothesSize.XS, 200, "Red");
		Clothes cl2 = new Tshirt(ClothesSize.S, 5, "White");
		Clothes cl3 = new Pants(ClothesSize.M, 300, "Black");
			Clothes [] arrayofcloth = {cl0, cl1, cl2, cl3};
					Atelier.dressWoman(arrayofcloth);
					Atelier.dressMan(arrayofcloth);

	}

}
