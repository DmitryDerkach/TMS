package homework_lesson2;
//�������� ��������� ������ ������� �������� ���������� �� ������ � ���������� ��� �������� ���� �� 1 �� 20 ������.
//1 ���� = 2,54 ��.
public class Task5 {
	public static void main(String[] args) {
		int inch = 2;
		double sentimeters;
	    sentimeters  = inch * 2.54;
	    if (inch>20 || (inch<1)) {
	    	System.out.println("��������� �������� �� ������� ���������� ���� �� 1 �� 20 ������ ������������");
	    	System.out.println("������� ���������� ���������");
	    } else {
	    	System.out.printf("%1$d in = %2$.2f �m \n", inch,sentimeters);	
	    }	
// ��� ���� �������
	int in=1;
	int variable=1;
	double sm=0;
	
	while (variable<=in) {
		sm = sm + 2.54;
		variable++;
	}
	System.out.printf("%1$d in = %2$.2f �m",in,sm);
		
		
		
  } 
}
