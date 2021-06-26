package homework_lesson8.taskcloth;

import homework_lesson8.taskcloth.jacket.Jacket;
import homework_lesson8.taskcloth.pants.Pants;
import homework_lesson8.taskcloth.shoes.Shoes;

public class Human {
	private String name;
	private Jacket j;
	private Pants p;
	private Shoes sh;
	
		public Human(String name, Jacket j, Pants p, Shoes sh) {
			this.name = name;
			this.j = j;
			this.p = p;
			this.sh = sh;
		}
		public Human(){
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Jacket getJ() {
			return j;
		}
		public void setJ(Jacket j) {
			this.j = j;
		}
		public Pants getP() {
			return p;
		}
		public void setP(Pants p) {
			this.p = p;
		}
		public Shoes getSh() {
			return sh;
		}
		public void setSh(Shoes sh) {
			this.sh = sh;
		}
		public void dressUp() {
			System.out.println(name + " одевается:");
			j.dressUpJacket();
			p.dressUpPants();
			sh.dressUpShoes();
		}
		public void dressDown() {
			System.out.println(name + " раздевается:");
			j.dressDownJacket();
			p.dressDownPants();
			sh.dressDownShoes();
		}
		public void totalCost() {
			System.out.print("Общая стоимость: ");
			System.out.println(j.getPriece() + p.getPriece() + sh.getPriece());
		}
}
