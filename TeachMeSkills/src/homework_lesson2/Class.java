package homework_lesson2;

public class Class {

	public static void main(String[] args) {
		//���������������� ���� While
		
// while (condition) {
//				���� �����
//			}
		
	int n = 10;
	while (n>0) {
		System.out.println("��� " + n);
		n--;
}
	
// ���� ����� ����� ���� ������
	int a = 100;
	int b = 200;
	
	while (++a <--b); 
	System.out.println("������� ����� " + b);
	
//���������������� ���� do-while	
//do {
//			���� �����
//}while (condition);
	
	int c = 10;
	do {
		System.out.println("��� " + c);
		c--;
	} while (c>0);
	
//������������ ����� for
//			for (initialization; condition; iteration) {
//				���� �����
//			}
	
	int d;
	int e = 0;
	for (d=1; d<10; d++) {
		System.out.print(d + " ������ �����   ");
		e+=d;
		System.out.println("e=" + e);
				
	}
//������������ ��������c�� ����� for 
	
	int f;
	int g;
	for (f=0;f<10;f++) {
		for (g=f; g<10; g++) {
			System.out.print(".");
		}
		System.out.println();
	}

	
//�������� �������� break
	int h;
	for (h=0;h<10;h++) {
		if (h==5) {
			break;
		}
		System.out.println(h);
	}
	System.out.println();
//�������� �������� continue
//������ ������� ������ ��������� �������� ����� ��������. �� ����
//����� ���������� ���������� �����, �� ���������� ��������� �������
//���� � ��� ���� ��� ������ ������� ��������. ����� �������� ���������
//�������� continue.
//- � ������ while � do-while �������� continue �������� ��������
//���������� ��������������� ��������� ���������, �������
//��������� ������.
//- � ����� for ���������� ��������� ������� � ������������ �����
//��������� for � ����� � ��������� ���������. ��� ���� ��� ������
//����� ������������� ��� ���������.

	int i;
	for(i=0;i<10;i++) {
		if (i==5) {
			continue;
		}
		System.out.println(i);
	}
	
//������������ continue
	int z = 10;
	while (z>5) {
		if (z==7) {
			continue;
		}
		z--;
		System.out.println(z);
	}
	
// �������� return
// ���� �� ������ �������, ����� ���� ������ �������� ��� ������, ������� � ��. 
// ����
	boolean t = true;
	System.out.println("�� ���������� ��������");
	if (t) return; // ������� � ����������� �������
	System.out.println("���� �������� ����������� �� �����");	

	}

}
