package homework_lesson1;
//���� ��� ����� �����. ����� ���������� ������������� � ������������� ����� � �������� ������.
public class Task5 {
	public static void main(String[] args) {
		int a = -4;
		int b = 0;
		int c = 128;
		int d;
		int e;
		int f;
			if (a>0) {
				d = 1;
}
			else { if (a==0) {
				d=0;
}
			else {
				d = -1;
}
}
			if (b>0) {
				e = 1;
}
			else { if (b==0) {
				e=0;
}
			else {
				e = -1;
}
}
			if (c>0) {
				f = 1;
}
			else { if (c==0) {
				f = 0;
}
			else {
				f = -1;
}
}							
			int x = d + e + f;
			if (((d==0) && (e==0)) || ((d==0) && (f==0)) || ((e==0) && (f==0)) || ((d==0) && (e==0) && (f==0))){
				switch (x) {
				case -1:
					System.out.println("���-�� ������������� ����� ����� 1");
					System.out.println("���-�� ����� ����� 2");
					break;
				case 1:
					System.out.println("���-�� ������������� ����� ����� 1");
					System.out.println("���-�� ����� ����� 2");
					break;
				case 0:
					System.out.println("���-�� ����� ����� 3");
					break;
}
}
			else {
			switch (x) {
			case -3:
				System.out.println("���-�� ������������� ����� ����� 3");
				break;
			case 3:
				System.out.println("���-�� ������������� ����� ����� 3");
				break;
			case 1:
				System.out.println("���-�� ������������� ����� ����� 2");
				System.out.println("���-�� ������������� ����� ����� 1");
				break;
			case -1:
				System.out.println("���-�� ������������� ����� ����� 2");
				System.out.println("���-�� ������������� ����� ����� 1");
				break;
			case -2:
				System.out.println("���-�� ������������� ����� ����� 2");
				System.out.println("���-�� ����� ����� 1");
				break;
			case 2:
				System.out.println("���-�� ������������� ����� ����� 2");
				System.out.println("���-�� ����� ����� 1");
				break;
			case 0:
				System.out.println("���-�� ������������� ����� ����� 1");
				System.out.println("���-�� ������������� ����� ����� 1");
				System.out.println("���-�� ����� ����� 1");
				break;
							
}
}	
}
}
