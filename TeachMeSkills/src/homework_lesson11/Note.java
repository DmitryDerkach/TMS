package homework_lesson11;
import java.io.*;
public class Note {
	public static void main(String[] args) throws IOException{
/*Потоки ввода - вывода. В этом документе будет код, переписанный ручками, для лучшего усвоения материала
 *Байтовый поток*/
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		try {
		fileIn = new FileInputStream("file.txt"); /*Если файл не был создан, то выбьет ошибку FileNotFound exeption*/
/*Если создать файл в другом проекте, то он не будет обнаружен, но если создать файл в нужном нам проекте, и не обязательно в нужном нам 
 *пэкэжджэ, то он его найдет*/		
		fileOut = new FileOutputStream("copied_file.txt"); /*Даже если такого файла нет, то ошибку не выбивает*/
		int a;
/*Копируем содержимое файла file.txt*/
		while ((a = fileIn.read()) != -1) {
			fileOut.write(a);
		}
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null){
				fileOut.close();
			}
		}	
	} 		
}
/*Забавно. Идет выполнение программы, но файл, в который записывются данные я найти не могу. Я даже не уверен, создан ли он. Пойду чекну директорию.
 *Файл отображается в директории, но не отображается в проекте. Странно.*/


