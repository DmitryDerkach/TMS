package homework_lesson9.task4;
/*Вводим с клавиатуры предложения. Если предложение содержит от 3-ех до пяти слов или, если оно содержит палиндром, вывести в коносль информацию, что
 *предложение удовлетворяет условию, если нет - соответствующую информацию. 
 *Оформляем в ООП стиле, создавая класс TextFormater с двумя методами:
 * 	Метод getLine(String line) принимает предложение и выводит результат в консоль. Также метод должен вызывать другой метод,
 *  выполняющий проверку на налчие палиндрома в предложении*/
import java.util.Scanner;

public class Appliaction {
	public static void main(String[] args) {
System.out.println("Вводите предложения. Предложения раздляйте точкой, слова в приложении - пробелом или запятой: ");
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();
/*Нужно посчиатать кол-во точек. По ним определим кол-во предложений*/
char [] arrayofsymbols = line.toCharArray();/*Раскладываем нашу большу строку в массив символов*/
int counter = 0;
	for (int i = 0; i < arrayofsymbols.length; i++) {
		if (arrayofsymbols[i] == '.') {		/*На каждую точку вешаем каунтер, который отражает кол-во наших предложений*/
			counter += 1;
		}
	}
/*Разобравшись с кол-вом предложений в нашем тексте, занесем каждое предложение в отдельную ячейку стрингового массива*/	
String [] arraywithlines = new String [counter]; /*Размерность массива равна кол-ву предложений и равна кол-ву точек*/
/*Далее выполняем ряд опреаций по записи */
int supcounter = 0; /*Создаем 2 каунтера, даже будет ясно, зачем именно*/
int supcounter2 = 0;
for (int i = 0; i < arrayofsymbols.length; i++) {/*Начинаем шагать по всему массиву символов*/
	if (arrayofsymbols[i] == '.') { /*Встречаем точку и понимаем, что это конец предложения*/
			 StringBuilder strb = new StringBuilder();/*strb - экземпляр класса стрингбилдер, в котором мы будем хранить наши символы*/
			 if (supcounter == 0) {/*Так как встречаем в первый раз нужно записать все, что от 0 и до точки(не включая точку)*/
				for (int z = 0; z <= i; z++) { /*i содежит индекс точки, которую не учитываем, поэтому z < i*/
						strb.append(arrayofsymbols[z]);/*добавляем к нашему strb аппендом символы вплоть до точки(Включительно! Это важно!)*/
				}
		arraywithlines [supcounter]	= strb.toString();/*Преобразуем билдер в стринг и полученное предложение заносим в массив*/	
		supcounter +=1;/*Вручную прописываем иттерацию нашего массива строк*/
		supcounter2 = i; /*Как будет видно далее, это число понадобится для грамотного оформления массива, т.к. второе предложение
мы будем считывать уже не с нуловго индекса, а места остановки i(точка) + 1. А значит и логика заполнения изменится*/
			} else {
				for (int z = i; z > supcounter2; z--) {/*Суть в заполении с конца предложения до предыдущей точки с последующим реверсом*/
					strb.append(arrayofsymbols[z]);	
			}
	supcounter2 = i;			
	strb.reverse();
	arraywithlines [supcounter]	= strb.toString();	
	supcounter +=1;
			}				 
		}		 			 
	}
/*Так, массив строк мы создали. В каждой ячейке лежит по предложению. Идем оформлять TextFormater*/
/*Спустя 10 тысяч лет - оформил*/
/*Проверочка*/
	for (int i = 0; i < arraywithlines.length; i++) {
		TextFormater.getLine(arraywithlines[i]);
	}
}
}
