package homework_lesson2;
//�������� ���������,  ������������ ����� ���� �������� ����� �� 1 �� 99
public class Task7 {
	public static void main(String[] args) {
		
		int sum = 0;
		int a = 1;
		while (a<=99) {
			sum = sum + a;
			a = a + 2;		
		}
		System.out.println("C���� ���� �������� ����� �� 1 �� 99 ����� " + sum);
	}
}
