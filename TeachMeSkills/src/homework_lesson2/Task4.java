package homework_lesson2;
//��������� ���������, ����������� �*�, �� ��������� ��������� ���������.
public class Task4 {
	public static void main(String[] args) {
		
		int a = -7;
		int b = 7;
		int c;
		int sum = 0;
	    
		if ((a==0) || (b==0)){
			System.out.printf("%d �������� �� %d ����� 0",a,b);
		} else {
			for (c=1; c<=Math.abs(b); c++) {
				sum = sum + a;
				//System.out.printf("%d �������� �� %d ����� %d   \n",a,c,sum);
			}
				sum = Math.abs(sum);
				
			    if (((a>0)&&(b>0))||((a<0)&&(b<0))) {
			    	
			    System.out.printf("%d �������� �� %d ����� %d   \n",a,b,sum);
			    
			    } else {
			    System.out.printf("%d �������� �� %d ����� -%d   \n",a,b,sum);
			    }
			    
				}
		
}
}
