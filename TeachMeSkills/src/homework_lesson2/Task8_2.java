package homework_lesson2;
//���������. ������ ����������� �1 �� ������ ������ � 3-�� �������
public class Task8_2 {
	public static void main(String[] args) {
		
		 for (int step = 1; step<=4; step++) {
			 for (int space = 0; (space + step) != 4; space++) {
				 System.out.print(" ");
			 }
			 
			 for (int star = 0; star != step; star++) {
			 
			 System.out.print("*");
		 }
			 System.out.println();
			 
		 }
//� ��� ����� ������ ���-�� �� ������, kekW. �������, ��� ����� �����
	}
}
