package homework_lesson3;
//Создайте массив из всех нечетных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран
//тоже в строку, но в обратном порядке
import java.util.ArrayList;

public class Task2 {
public static void main(String[] args) {

int[]mass = new int[99];
mass[0] = 1;
	for (int i = 1; i<99; i++) {
		mass[i] = mass[i-1] + 1;
	}
//System.out.println("Default array: ");
//	for (int i = 0; i<99; i++) {
//		System.out.print(mass[i] + " ");
//		if (mass[i] % 10 == 0) {
//			System.out.println();
//		}
//	}
//System.out.println();	
ArrayList<Integer> mass2 = new ArrayList<Integer>();
for(int i = 0; i<99; i++) {
	if (mass[i] % 2 != 0) {
		mass2.add(mass[i]);
	}
}
System.out.println("Only odds number array: ");
for (int i = 0; i<mass2.size(); i++) {
	System.out.print(mass2.get(i) + " ");
}
System.out.println();
System.out.println("Reverse: ");

for (int a = mass2.size(); a>0 ; a--) {
	System.out.print(mass2.get(a-1) + " ");
}

		
}
}
