package homework_lesson9.task4;
import java.util.*;
import homework_lesson9.task4.TextFormater;
public class Application extends TextFormater{
public static void main(String[] args) {
	System.out.print("Введите текст: ");
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();/*Некстлайном в текст записывается вообще все, что вводишь*/
	//System.out.println(text.length()); /*Делал проверку*/
	
	/*Разделяем весь введенный текст на предложения. Как? Все предложения заканчиваются точкой. Чекнуть таблицу*/
	/*Каждое предложение будем запихивать в массив чаров*/
	char test = 46; /*Номер точки по ASCII Seven Bit Character Set*/
	char test1 = 33;/*Номер воскл. знака по ASCII Seven Bit Character Set*/
	char test2 = 63;/*Номер вопроса по ASCII Seven Bit Character Set*/
	System.out.println(test);
	System.out.println(test1);
	System.out.println(test2);

	char [] sup = new char [text.length()];
	String [] sentence = new String [sup.length]; /*Я хз, чо там по длинне, так что возьмем так, с запасиком*/
		for (int i = 0; i < sentence.length; i++) {
			sentence[i] = "" ;/*Перезаписываем богомерзкий нулл  на православный пробел. Если честно, я хз, по-
			чему нулл не пропадает при перезаписи*/
		}
	int z = 0;/*Счетчик*/
	sup = text.toCharArray(); /*Конвертим нашу строку в чары и суем их в массив*/
	for (int i = 0; i < text.length(); i++) {
		block: if ((sup[i] == 46) || (sup[i] == 33) || (sup[i] == 63)) {
			System.out.println("Встретили разделитель предложения. Значит, конец предложения");
			sentence[z] += ".";
			z+=1;
			break block;
		} else {
			sentence[z] += String.valueOf(sup[i]); /*Записываем наши символы до знака разделения в массив строк*/
		}
	}
	/*Так, есть массив строк, в каждой ячейке которогор лежит предложение со знаком-разделителем*/
	/*Считываем строки, получается*/
		for (int i = 0; i < sentence.length; i++) {
			TextFormater.redactor(sentence[i]);
		}
	
	



	
}
}
