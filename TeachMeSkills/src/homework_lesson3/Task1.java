package homework_lesson3;
/*�������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� �������� ������� �� ����� ������� � ������, ������� ���� ������� �� �������
 * ��������, � ����� � �������(������� ���� ������� �� ������� ������� ����� ������). ����� ��������� ������� ��������� , ������ �� ����� �������*/

public class Task1 {
public static void main(String[] args) {

//��� 1. ������� ������ � ��������� ����������
	int[] mass = new int[20];
//��� 2. ��������� ��� ���������� �� 1 �� 20
	mass[0] = 1;
	for(int i = 1; i<20; i++) {
		mass[i]  = mass[i-1] + 1;
	}
//��� 4.��������
	System.out.println("Array with 20 num-s");
	for(int i = 0; i<20; i++) {
		System.out.print(mass[i] + " ");
	}
//��� ������, ���� ������
//��� 5. ���������� ������ �������� �������, � ������� ����� ������ ������ �����: 20/2 = 10	
//��� 6. ������ ������, � ������� ����� ������ ������ �����
	int mass2[] = new int[10];
	int j = 0;
	for(int i = 0; i<20; i++) {
		if (mass[i] % 2 == 0) {
			mass2[j] = mass[i];
			j++;
		}
	}
	
	System.out.println();
//��� 7. ��������� ���������� ������� ������� ������� �������
	System.out.println("New array with evens only:");
	for(int i = 0; i<10; i++) {
		System.out.print(mass2[i] + " ");
	}
	System.out.println(" - Output in sting-view like");
	for(int i = 0; i<10; i++) {
		System.out.println(mass2[i]);
	}
		System.out.println("Output in column-view like");
	
	
	
}	
}
