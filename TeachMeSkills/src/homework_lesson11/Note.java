package homework_lesson11;
import java.io.*;
public class Note {
	public static void main(String[] args) throws IOException{
/*Потоки ввода - вывода. В этом документе будет код, переписанный ручками, для лучшего усвоения материала
 *Байтовый поток*/
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		try {
		fileIn = new FileInputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\fileN1.txt"); /*Если файл не был создан, то выбьет ошибку FileNotFound exeption*/
/*Если создать файл в другом проекте, то он не будет обнаружен, но если создать файл в нужном нам проекте, и не обязательно в нужном нам 
 *пэкэжджэ, то он его найдет*/		
		fileOut = new FileOutputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\copied_fileN1.txt"); /*Даже если такого файла нет, то ошибку не выбивает, происходит автосоздание
файла с таким именем. Чтобы его увидеть, нужно нажать на проекте F5 или использовать функцию рефреш*/
		int a;
/*Копируем содержимое файла file.txt*/
		while ((a = fileIn.read()) != -1) {
			fileOut.write(a);/*Кирилческие символы занимают 16 бит, поэтому в консоль передается чушь. Но, что характерно, в файл пишется 
			слово, которое мы указали (спрашивается, а на какой нам тогда символьные потоки???)*/
			char b = (char)a;
			System.out.println(b);
		}
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null){
				fileOut.close();
			}
		}	 		
/*Примечание. Если создать файл с точно таким же названием (file.txt), то в копиед_файл все равно нужно будут записываться данные из 
 *файла file.txt, который на уровне проекта, а не на уровне пэкэджа. Если все же нужен файл на уровне пэкэджа, то нужно писать полный
 *путь к файлу, например:	fileIn = new FileInputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\file.txt");  */

/*FileReader, FileWWriter - символьные потоки. */
FileReader fileR = null;
FileWriter fileW = null;
	try {
		fileR  = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\fileN2.txt");
		fileW = new FileWriter("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\copied_fileN2.txt");
		int a = 0;
		while ((a = fileR.read()) != -1) {
			fileW.write(a);
			char b = (char)a;
			System.out.print(b);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		fileR.close();
		fileW.close();
	}
/*BufferedWritter*/	
	BufferedWriter buffW = null;
	try {
		buffW = new BufferedWriter(new FileWriter("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\copied_fileN3.txt"));
		String text = "Hello. My name is Dima. Right now i am learning java. It's quite difficult but i hope everthing will be okay";
		buffW.write(text);
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		buffW.close();
	}
/*BufferedReader*/
	BufferedReader buffR = null;
	try {
		buffR = new BufferedReader(new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\copied_fileN3.txt"));
		int a = 0;
		System.out.println();
		while ((a = buffR.read()) != -1) { /*Чтение посимвольно*/
			buffR.read();
			System.out.print((char)a);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		buffR.close();
	}
	
	
	
}
}























