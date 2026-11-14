package homework_lesson8.taskcloth;

import homework_lesson8.taskcloth.jacket.ArmaniJacket;
import homework_lesson8.taskcloth.jacket.GucciJacket;
import homework_lesson8.taskcloth.pants.ArmaniPants;
import homework_lesson8.taskcloth.shoes.ArmaniShoes;
import homework_lesson8.taskcloth.shoes.GucciShoes;

/* Описание (2026): Задача "Человек и одежда": создаёт двух людей, одевает их в куртку, штаны и обувь брендов Armani/Gucci через интерфейсы, вызывает одеться/раздеться и считает общую стоимость. Демонстрирует полиморфизм через интерфейсы и явное приведение типа для вызова setPriece(). */
public class Application {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setName("Дима");
		h1.setJ(new GucciJacket());
		h1.setP(new ArmaniPants());
		h1.setSh(new GucciShoes());
		h1.dressUp();
		h1.dressDown();
			Human h2 = new Human("Виктор", new ArmaniJacket(), new ArmaniPants(), new ArmaniShoes());
			ArmaniJacket pr1 = (ArmaniJacket)h2.getJ();
			pr1.setPriece(500);
				ArmaniPants pr2 = (ArmaniPants)h2.getP();
				pr2.setPriece(500);
					ArmaniShoes pr3 = (ArmaniShoes)h2.getSh();
					pr3.setPriece(500);
			h2.setJ(pr1);
			h2.setP(pr2);
			h2.setSh(pr3);
			h2.dressUp();
			h2.dressDown();
			h2.totalCost();
	}

}
