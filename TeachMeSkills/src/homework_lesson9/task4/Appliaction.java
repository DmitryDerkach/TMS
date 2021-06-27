package homework_lesson9.task4;

import java.util.Scanner;

public class Appliaction {
	public static void main(String[] args) {
System.out.println("Вводите предложения. Предложения раздляйте точкой: ");
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();
/*Нужно посчиатать кол-во точек. По ним определим размерность будущего маасива*/
char [] arrayofsymbols = line.toCharArray();
int counter = 0;
	for (int i = 0; i < arrayofsymbols.length; i++) {/*Кол-во точек равно кол-ву предложений*/
		if (arrayofsymbols[i] == '.') {
			counter += 1;
		}
	}
/*Создаем массив строк с кол-вом ячеек равынм кол-ву предложений*/
String [] arraywithlines = new String [counter];
/*Теперь в ячейки наешго массива нужно положить строки*/
int supcounter = 0;
int supcounter2 = 0;
for (int i = 0; i < arrayofsymbols.length; i++) {	
	if (arrayofsymbols[i] == '.') { /*Считываем массив символов, встречаем точку. В первый раз записываем в строку все, что от 0 и до точки*/
			 StringBuilder strb = new StringBuilder();
			 if (supcounter == 0) {
				for (int z = 0; z < i; z++) { /*i содежит индекс точки, которую не учитываем, поэтому z < i*/
						strb.append(arrayofsymbols[z]);	
				}
		arraywithlines [supcounter]	= strb.toString();	
		supcounter +=1;/*Вручную прописываем иттерацию нашего массива строк*/
		supcounter2 = i; /*Это число понадобится для грамотного оформления массива стрингов, т.к. второе слово мы будем считывать уже не с 0*/
			} else {
				for (int z = i-1; z > supcounter2; z--) {
					strb.append(arrayofsymbols[z]);	
			}
	supcounter2 = i;			
	strb.reverse();
	arraywithlines [supcounter]	= strb.toString();	
	supcounter +=1;
			}				 
		}		 			 
	}
/*Так, массив строк мы создали. Идем оформлять TextFornater*/
/*Спустя 10 тысяч лет - оформил*/
/*Проверочка*/
	for (int i = 0; i < arraywithlines.length; i++) {
		TextFormater.getLine(arraywithlines[i]);
	}








}
}













/*Задача - разбить нашу писанину в предложения*/

//char [] arrayofsymbols = line.toCharArray();/*Раскаладываем нашу строку в символы и заносим в массив*/
//for (int i = 0; i < arrayofsymbols.length; i++) {
//	if (arrayofsymbols[i] == '.') { /*Встретили точку. Работаем с символами, которые у нас стояли до этой точки*/
//		
//		
//		
//	}
//}
		
		
		
		
		
		


