package homework_lesson9.task4;

public class TextFormater {
	public static void getLine(String line) {
		char [] sup = line.toCharArray();
			if ((sup.length >= 3) && (sup.length <= 5)){
				System.out.println("Слово " + line + " удовлетворяет условию");
			} else {
					palindromCheck(line);
					if (palindromCheck(line) == true) {
						System.out.println("Слово " + line + " является палиндромом");
					} else {
						System.out.println("Слово " + line + "  не удовлетворяет условию");
					}
			}
	}
	private static boolean  palindromCheck(String line) {
		boolean sup = false;
		int counter = 0;
		char [][] suparr = new char [1][];   
		suparr[0] = line.toCharArray();		
		int arrint = suparr[0].length;	
		for(int z = 0; z < arrint; z++) {
		if (suparr[0][z] != suparr[0][arrint - 1 - z]) {
			if ((Character.toUpperCase(suparr[0][z]) == suparr[0][arrint - 1 - z]) || (Character.toLowerCase(suparr[0][z]) == suparr[0][arrint - 1 - z])) {
				counter+=1;
				if (counter == arrint) {
					sup = true;
				}
			} else {
				sup = false;
			}	
		} else {
			counter+=1;
			if (counter == arrint) {
				sup = true;
			} 
		}
	}
return sup;	
}

}
	
