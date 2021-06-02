package homework_lesson2;
//������������� ����� ������ 3 ���� ������� �� 2 ������. ����������, ������� ���� ����� ����� 3,6,9,12,...,24 ����.
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
