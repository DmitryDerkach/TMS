package homework_lesson2;
//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значения длин от 1 до 20 дюймов.
//1 дюйм = 2,54 см.
public class Task5 {
	public static void main(String[] args) {
		int inch = 2;
		double sentimeters;
	    sentimeters  = inch * 2.54;
	    if (inch>20 || (inch<1)) {
	    	System.out.println("Программа расчтана на перевод расстояний длин от 1 до 20 дюймов включительно");
	    	System.out.println("Введите корректное рассояние");
	    } else {
	    	System.out.printf("%1$d in = %2$.2f сm \n", inch,sentimeters);	
	    }	
// Еще одно решение
	int in=1;
	int variable=1;
	double sm=0;
	
	while (variable<=in) {
		sm = sm + 2.54;
		variable++;
	}
	System.out.printf("%1$d in = %2$.2f сm",in,sm);
		
		
		
  } 
}
