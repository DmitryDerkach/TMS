package homework_lesson2;
//����� ����������, ��������� � ������ ���� �������� 10 ��. ������ 
//���� �� ���������� ������� ����� �� 10% ����� ����������� ���. ����� 
//��������� ���� �������� ��������� �� 7 ����?
public class Task1 {
	public static void main(String[] args) {
		 double distance = 10;
		 double percentage = 0.1;
		 double sum = 10;
		 for (int d=2; d<8; d++) {
			 distance = distance + distance * percentage;
			 sum = sum + distance;
		 }
		 System.out.printf("Total distance %1$5.2f", sum);			
	}	
}
