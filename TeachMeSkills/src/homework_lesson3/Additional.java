package homework_lesson3;
//bubble sorting from lower to higher
import java.util.Random;
import java.util.Scanner;

public class Additional {
public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
Random r = new Random();
System.out.print("Enter the number of numbers in the array: ");
int num = sc.nextInt();
int [] mass = new int[num]; // ������ ������ � ���-��� ���������, ��������� �������������
for (int i = 0; i<num; i++) {
	mass[i] = r.nextInt(10);  //����������� ������� �������� ��������� �������� �� 0 �� 9, ������������
}
System.out.println("Unsorted massive: ");
for (int i = 0; i<num; i++) {
	System.out.print(mass[i] + " ");
}
System.out.println();
System.out.println("Do bubble sorting from lower to higher case: ");	
for (int i = 1; i<num; i++) {		//----------  ����� ���-�� ���������. � ������ ������ ���������� �����, �������� � ����� �����,
	for (int j = 0; j<num-1; j++) {				//������ � �������� ���� ������ �� ��� ���, ���� ��� ����� �� �������� � ������	
												//�.�. �� ������ �� num (i=1;i<n)
		if (mass[j]>mass[j+1]) {      			
			int value = mass[j+1];   			//���� ��������� ����� �� ������� �� ���������� �����
			mass[j+1] = mass[j];
			mass[j] = value;
			
		}
		
		for (int k = 0; k<num; k++) {          //������ �� ����� ��������� ������ ����� ��������� 
		System.out.print(mass[k] + " ");
		}
		System.out.print("    ");
	}

	System.out.print("   Result of the step");
	System.out.println();

}

System.out.println("Final result of buuble sorting: ");
for (int i = 0; i<num; i++) {
	System.out.print(mass[i] + " ");
	}
sc.close();
}

}
