package homework_lesson2;
//������� ����������� �2 (������� ���������)
public class Task9_1 {
	public static void main(String[] args) {
		
		for(int step  = 0; step<=3; step++) {
			for (int space = 0; space != step; space++) {
				
				System.out.print(" ");
								
			}	
					
			for (int star = 0; step + star != 4; star++) {
				
				System.out.print("*");
			
			}
			System.out.println();
			
	}

	}
}
