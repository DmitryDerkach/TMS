package homework_lesson3;
/*�������� ������ �� 15 ��������� ����� �� ������� �� 0 �� 99 ������������. �������� ������ �� �����. ����������� ������� � ������� ������
 * ��������� � �������� ��� ���-�� �� �����*/
import java.util.Random;
public class Task3 {
public static void main(String[] args) {

Random r = new Random();	
System.out.println("Generting of an array that which consist of 15 random numbers from 0 to 99: ");
int [] mass = new int[15];
	for (int i = 0; i<mass.length; i++) {
		mass[i] = r.nextInt(100);
	}
//Checkout
	for (int i = 0; i<mass.length; i++) {
		System.out.print(mass[i] + " ");
	}
System.out.println();
System.out.print("Number of evens are: ");
int sum = 0;
for (int i = 0; i<mass.length; i++) {
	if(mass[i] % 2 == 0) {
		sum+=1;
	}	
}
System.out.println(sum);	
	
}
}
