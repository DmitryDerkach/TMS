package homework_lesson2;

public class Class {

	public static void main(String[] args) {
		//Продемнострируем цикл While
		
// while (condition) {
//				тело цикла
//			}
		
	int n = 10;
	while (n>0) {
		System.out.println("тик " + n);
		n--;
}
	
// Тело цикла может быть пустым
	int a = 100;
	int b = 200;
	
	while (++a <--b); 
	System.out.println("Средняя точка " + b);
	
//Продемонстрируем цикл do-while	
//do {
//			тело цикла
//}while (condition);
	
	int c = 10;
	do {
		System.out.println("Тик " + c);
		c--;
	} while (c>0);
	
//Демонстрация цикла for
//			for (initialization; condition; iteration) {
//				тело цикла
//			}
	
	int d;
	int e = 0;
	for (d=1; d<10; d++) {
		System.out.print(d + " проход цикла   ");
		e+=d;
		System.out.println("e=" + e);
				
	}
//Демонстрация вложенноcти цикла for 
	
	int f;
	int g;
	for (f=0;f<10;f++) {
		for (g=f; g<10; g++) {
			System.out.print(".");
		}
		System.out.println();
	}

	
//Оператор перехода break
	int h;
	for (h=0;h<10;h++) {
		if (h==5) {
			break;
		}
		System.out.println(h);
	}
	System.out.println();
//Оператор перехода continue
//Иногда полезно начать очередную итерацию цикла пораньше. То есть
//нужно продолжить выполнение цикла, но прекратить обработку остатка
//кода в его теле для данной частной итерации. Такое действие выполняет
//оператор continue.
//- В циклах while и do-while оператор continue вызывает передачу
//управления непосредственно условному выражению, которое
//управляет циклом.
//- В цикле for управление переходит сначала к итерационной части
//оператора for и затем к условному выражению. Для всех трёх циклов
//любой промежуточный код обходится.

	int i;
	for(i=0;i<10;i++) {
		if (i==5) {
			continue;
		}
		System.out.println(i);
	}
	
//Демонстрация continue
	int z = 10;
	while (z>5) {
		if (z==7) {
			continue;
		}
		z--;
		System.out.println(z);
	}
	
// Оператор return
// Пока не совсем понятно, нужно чуть больше прочесть про методы, объекты и др. 
// вещи
	boolean t = true;
	System.out.println("До выполнения возврата");
	if (t) return; // возврат к вызывающему объекту
	System.out.println("Этот оператор выполняться не будет");	

	}

}
