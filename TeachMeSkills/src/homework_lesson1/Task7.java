package homework_lesson1;
//(�������������) � ���������� ����������� ����������� �������������. � ����������� �� ���������� ������������� ����-
//������ ������� ��������� ���������. ��������: 2 �����������, 1 ����������, 10 ������������� � �.�.
public class Task7 {
	public static void main(String[] args) {
		//int k = a % 100;
				int a=21; 
				int k = a % 10;
				if (k<0) {
					System.out.println("���������� ������������� �� ����� ���� �������������");
				}
			    if ((k==1) && (a!=11)) {
			    	System.out.println(a + " " + "�����������");
			    }
			    else {
			    	if ((k>=2 && k<=4) && (a!=12 && a!=13 && a!=14)) {
			    		System.out.println(a + " " + "������������");
			    	}
			    	else { if ((k>=5) && (k<=9) || (k==0)){
			    		System.out.println(a + " " + "�������������");
			    	}
			    	else {
			    		switch (a) {
			    		case (11):
			    			System.out.println(a + " " + "�������������");
			    		break;
			    		}
			    		switch (a) {
			    		case (12):
			    			System.out.println(a + " " + "�������������");
			    		break;
			    		}
			    		switch (a) {
			    		case (13):
			    			System.out.println(a + " " + "�������������");
			    		break;
			    		}
			    		switch (a) {
			    		case (14):
			    			System.out.println(a + " " + "�������������");
			    		break;
			    		}
			    	}
			    		
			    	}
			    }
			}
}
