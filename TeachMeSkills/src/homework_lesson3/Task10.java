package homework_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
Random r = new Random();

System.out.print("Please insert positive number N which will represent length of the array. N should be bigger than 3:  ");
double a = sc.nextDouble();
	while (a <= 3) {
		System.out.print("You entered wrong number! Please enter correct number!: " );
		a = sc.nextDouble();
	}
sc.close();	
int b  = (int)a;	
int [] mass = new int[b];	
	for(int i=0; i<mass.length; i++) {
		mass[i] = r.nextInt(b+1);
	}
System.out.println("Generated array: ");	
	for(int i=0; i<mass.length; i++) {
		System.out.print(mass[i] + " ");
		}
	System.out.println();

System.out.print("Generating array #2 that contains only odd num-s from array #1: ");
int j = 0;// Индексы в массиве № 2
int k = 1;// Размер массива №2
	for (int i = 0; i<mass.length; i++) {
		mark:if(mass[i] % 2 == 0) {
			for(int z = 0; z<mass.length;) {   						//Тут вообще какое угодно условие можно было прописать
				int [] mass2 = new int[k];
				mass2[j] = mass[i];
				System.out.print(mass2[j] + " ");
				j+=1;
				k+=1;
				break mark;
			}
		}
	}
//k = k-1;
//System.out.println();
//int [] mass2 = new int[k];										//Массив, который в цикле не переносится дальше
//System.out.println("Check");
//System.out.println(k);
//for(int i = 0; i<mass2.length; i++)
//System.out.print(mass2[i] + " ");
}	
}

