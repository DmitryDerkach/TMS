package homework_lesson2;
//������������� ����� ������ 3 ���� ������� �� 2 ������. ����������, ������� ���� ����ла ����� 3,6,9,12,...,24 ����.
/* Описание (2026): Задача про деление клеток (амёб): одна клетка каждые 3 часа делится на 2. Циклом for с шагом 3 часа считает и выводит итоговое количество клеток через 24 часа (2^8 = 256). */
public class Task2 {
	public static void main(String[] args) {

	int hour;
	int newlife = 1;
	for (hour=3; hour<25; hour=hour+3) {
		
		newlife = newlife * 2;
		
		//System.out.printf("����� %1$d ���� ���-�� ���� ���������� %2$d  \n" ,hour, newlife);
	}
	System.out.printf("C�������� ���-�� ���� ���������� %1$d", newlife);
	}
}
