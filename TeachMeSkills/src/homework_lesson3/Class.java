package homework_lesson3;
// ������� �� ������
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Class {
public static void main(String[] args) {
/*����� �� �������� �������, �������� nextInt, �� �� ������ ����� 4 � �������� Enter. ��� ��� 4 - ��� �����, ��� ��� Int, �� �����
 * �������, ��� ��� ������� �� ������ Enter �� ���� ������������ � ��� ������ (�.�. � ������ ���� � 4 � Enter, ��� Enter - ���
 * ������� � ������ ������). ��� ��� ���� � ����� ����� ������� ����� nextLine, �� �� ���������� � ���� �� ������ ������, � � ���
 * ������� nextInt ��������� ������ 4-��, �� � ������� �������� ��� ������ ������, �.�. ��� ������� ������� Enter. ��� ���, ����
 * � ������� ���-�� ����, �� ����� nextLine() �������� ��� ���-�� ������. �������, ���� � ���� ����� � ����� nextLine ������������� 
 * �� ������������ ������ ������, ��� ����� ������� ����� ������ nextInt(); ������� ����� nextLine(); � ����� �� ������� ��
 * ������� ��� ������ ������, � ����� ��� ������� ������� next(); ��� ������� nextLine(); ������� ����� ���� ������ � ���, ��� ����
 * �� ��������� ������� next();,�� �� ������� � ������ ����������� ����� ������ ��� �����, ������� ���� �� ������� �������.
 * Ex: Hello World � ������� Enter, �� � ���� ���������� ����� ������ ����� Hello, � � ������� ��������� ��� ����� World, �.�. ���
 * ����� ������� � ��� ��������� ����� ����� ��������.
 * ����� ������� �����
 * ��� ������ �������� � �������� ���� ���������. ����� ���� ������� ���������, ��� ��� ������ �� ���� ������ ������ (�� �������?
 * �� �������) ������ ������, �� �������� Scanner Close
   */

//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age: "); 
//  int a = sc.nextInt(); //����� �����  � ������ ���� ����� � Enter
//  System.out.print("Type your name: "); 
//  String line  = sc.nextLine(); //���������� � ������� � ����� ������ ������ ������
//  System.out.println(a);
//  System.out.println(line);//������� ������ ������
  
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age: "); 
//  int a = sc.nextInt(); //����� �����  � ������ ���� ����� � Enter
//  System.out.print("Type your name: "); 
//  sc.nextLine(); //�������� �� ������� ������ ������
//  String line  = sc.nextLine(); //� ������� ������ ���, ���������� � ������� ���������� � ������
//  System.out.println(a);
//  System.out.println(line);//������� ��������� �����
//  sc.close(); //��������� ����� �����

//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type your age ");
//  int a = sc.nextInt();
//  sc.nextLine();
//  System.out.print("Type your name ");
//  String line = sc.nextLine();
//  System.out.println(a);
//  System.out.println(line);
//  sc.close();  //
//  System.out.println("Close...");
//  String line2 = sc.nextLine(); //�� �������� ����� Scanner Close
//  System.out.println(line2);	
	
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Type number: ");
//  int a = sc.nextInt();
//  Random random = new Random(); //������ ����� ������, �� ������� ��� ������������� �� ����������
//
//  while (a>0){
//      int r = random.nextInt(90) + 10; //  ���������� ��������� ��������� �������� �������� ���� int � �������� �� � �� n
//      System.out.print(r + " ");
//      a--;	
//  }
	
// �������� �� ������ �������� ���������� �������	
	
//Scanner sc = new Scanner(System.in);
//System.out.println("������� ����� �����: ");
//if (sc.hasNextInt()) {
//int a = sc.nextInt();
//System.out.println("�� ����� " + a);
//} else {
//System.out.println("�� ����� �� ����� �����");
//}
		
//	������������
//	System.out.println("������� �����: ");
//	Scanner sc = new Scanner(System.in);
//	String a = sc.nextLine(); //�� ���� � ������ ������������ �����. Enter �� ������������ 
//	String b = sc.nextLine();//������� ����� ��� ����� ����� �2
//	System.out.println(a); //������� �����
//	System.out.println(b);//������� ����� �2

/*�������*/

Scanner sc = new Scanner(System.in); // �������� ������ ���� �������
Random r = new Random();// ������� ������ ���� Random
System.out.println("������ �������:");
int n = sc.nextInt(); //������ ������ ������� � ����������
int mass[] = new int[n]; // ������� ������ ������� n
for (int i=0; i<mass.length; i++) {
	mass[i] = r.nextInt(9);// ��������� ������ ���������� ������� �� 0 �� 9 
}
System.out.println("������ ��� ���������:");
for (int i = 0; i<mass.length; i++) {
System.out.print(mass[i] + " "); //������� ������ �� �����
}
System.out.println();
int min = mass[0];
int max = mass[0];
for (int i = 0; i<mass.length; i++) {
	if(mass[i]<min) {									//������� ������������ � ����������� �������� � �������
		min = mass[i];
	}
	if(mass[i]>max) {
		max = mass[i];
	}
}
System.out.println("max = " + max + " min = " + min);  //���������� ���������
System.out.println("���������� ���������:");
for (int i = mass.length-1; i>0;i--) {
	for (int j = 0; j<i; j++) {
		if(mass[j]<mass[j+1]) {
		int value = mass[j];
		mass[j] = mass[j+1];
		mass[j+1] = value;
		}
	}
}
for (int i = 0; i<mass.length; i++) {
	System.out.print(mass[i] + " ");
}

System.out.println();

Arrays.sort(mass);										
System.out.println("��������������� �� �����������");		//�������������� ����������� ������� �� �����������
for (int i = 0; i<n; i++) {
	System.out.print(mass[i] + " ");
}
System.out.println();
	
Arrays.sort(mass);											//������ int �������
reverse(mass);
System.out.println("��������������� �� ��������");
for (int i = 0; i<n; i++) {
	System.out.print(mass[i] + " ");
}


} //���� ������ ��������� �� ������, �� � ������
public static void reverse(int[] input) 
{ int last = input.length - 1; 
int middle = input.length / 2; 
for (int i = 0; i <= middle; i++) { 
	int temp = input[i]; input[i] = input[last - i]; input[last - i] = temp; 

}
}




}
