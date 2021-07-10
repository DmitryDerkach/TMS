package homework_lesson12_13.examplesfromconspect;

public class AAA {
	public static int sortDesc(final int num) {
		/*Определяем кол-во цифр в нашем числе*/
		int supnum = 1; /*Вспомогательное число для определения кол-ва цифр*/
		int counter = 0;/*Вспомогательное число, которое будет отражать кол-во цифр в числе*/
			while (supnum >= 1) {
				supnum = num / 10;
				counter += 1;
			}
		/*Создаем массив в котром будут хранится наши числа (нужен для сортировки)*/	
		int[] arrayofnums = new int[counter];
		/*Создаем вспомогательный массив чаров (нужен для заполнения интового массива)*/
		char[] suparraywithchars = new char[counter];
		/*Заполняем интовый массив*/
		String supstring = String.valueOf(num);
		suparraywithchars = supstring.toCharArray();
			for (int i = 0; i < counter; i++) {
				arrayofnums[i] = suparraywithchars[i] - '0';
			}
		/*Массив заполнили, вызывает метод, который отсортирует нам наши числа. По итогу получае полностью отсортированный массив*/	
			for (int i = 0; i < counter; i++) {
				sorting();
			}
		/*Извлекаем числа из массива*/
			String sortednum = "";
			for (int i = 0; i < counter; i++) {
				sortednum = sortednum.concat(String.valueOf(arrayofnums[i]));	
			}
		/*Уберем пробелы, на всякий случай*/
			sortednum.trim();
		/*Переводим строку в число, которое и будем возвращать*/
			int i = Integer.parseInt(sortednum);
			return i;		
												/*Метод сортировки*/
									private static int[] sorting(arrayofnums) {
										for (int i = 0; i < counter; i++) {
										if (i == counter - 1) {
												continue;
											}
										if (arrayofnums[i] > arrayofnums[i+1]) {
											int supnuminarrray = arrayofnums[i];
											arrayofnums[i] = arrayofnums[i+1];
											arrayofnums[i+1] = supnuminarrray;
										} else {
											int supnuminarrray = arrayofnums[i+1];
											arrayofnums[i+1] = arrayofnums[i];
											arrayofnums[i] = supnuminarrray;
										}
									}
										return arrayofnums;
								}	
	}/*Скобка основного метода*/
} /*Скобка класса*/
 		