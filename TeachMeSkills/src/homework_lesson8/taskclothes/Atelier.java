package homework_lesson8.taskclothes;

public class Atelier{
	private static Clothes [] cl = null;
		public static void dressWoman(Clothes [] arrayofcloth) {
			cl = arrayofcloth;
			System.out.println("Доступаня женская одежда:");
			for (int i = 0; i < cl.length; i++) {
				if (cl[i] instanceof WomanCloth) {
					System.out.println(cl[i].toString());
				}
			}
		}
		public static void dressMan(Clothes [] arrayofcloth) {
			cl = arrayofcloth;
			System.out.println("Доступаня мужская одежда одежда:");
			for (int i = 0; i < cl.length; i++) {
				if (cl[i] instanceof ManCloth) {
					System.out.println(cl[i].toString());
				}
			}
		}	
}
	

