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
		//String a = null; 
		System.out.println(); 
		while ((a = buffR.read()/*Line()*/) != -1/*null*/) {/*Чтение посимвольно. C чтением построчно тоже проблем нет*/
			System.out.print((char)a);
			//System.out.println(a);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		buffR.close();
	}
/*inputStreamReader*/
/*Чтение стандартного потока ввода, до введения пользователем "q"*/	
	InputStreamReader isr = null;
	try {
		isr = new InputStreamReader(System.in);
		System.out.println("Insert <<q>> for exit");
		char a; 
			do {
				a = (char) isr.read();
				System.out.println(a);
			} while (a != 'q');
	} finally {
		isr.close();
	}
	/*
	 * Класс File Класс File, определенный в пакете java.io, не работает напрямую с
	 * потоками. Его задачей является управление информацией о файлах и каталогах.
	 * Хотя на уровне операционной системы файлы и каталоги отличаются, но в Java
	 * они описываются одним классом File.
	 * 
	 * В зависимости от того, что должен представлять объект File - файл или
	 * каталог, мы можем использовать один из конструкторов для создания объекта:
	 * File(String путь_к_каталогу) 
	 * File(String путь_к_каталогу, String имя_файла)
	 * File(File каталог, String имя_файла) 
	 * Например: 
	 * // создаем объект File для каталога File dir1 = new File("C://SomeDir"); 
	 * //создаем объекты для файлов, которые находятся в каталоге File file1 = new File("C://SomeDir","Hello.txt"); 
	 * File file2 = new File(dir1, "Hello2.txt"); 
	 * Класс File имеет ряд методов, которые позволяют управлять файлами и каталогами. Рассмотрим
	 * некоторые из них:
	 * 
	 * boolean createNewFile(): создает новый файл по пути, который передан в
	 * конструктор. В случае удачного создания возвращает true, иначе false
	 * 
	 * boolean delete(): удаляет каталог или файл по пути, который передан в
	 * конструктор. При удачном удалении возвращает true.
	 * 
	 * boolean exists(): проверяет, существует ли по указанному в конструкторе пути
	 * файл или каталог. И если файл или каталог существует, то возвращает true,
	 * иначе возвращает false
	 * 
	 * String getAbsolutePath(): возвращает абсолютный путь для пути, переданного в
	 * конструктор объекта
	 * 
	 * String getName(): возвращает краткое имя файла или каталога
	 * 
	 * String getParent(): возвращает имя родительского каталога
	 * 
	 * boolean isDirectory(): возвращает значение true, если по указанному пути
	 * располагается каталог
	 * 
	 * boolean isFile(): возвращает значение true, если по указанному пути находится
	 * файл
	 * 
	 * boolean isHidden(): возвращает значение true, если каталог или файл являются
	 * скрытыми
	 * 
	 * long length(): возвращает размер файла в байтах
	 * 
	 * long lastModified(): возвращает время последнего изменения файла или
	 * каталога. Значение представляет количество миллисекунд, прошедших с начала
	 * эпохи Unix
	 * 
	 * String[] list(): возвращает массив файлов и подкаталогов, которые находятся в
	 * определенном каталоге
	 * 
	 * File[] listFiles(): возвращает массив файлов и подкаталогов, которые
	 * находятся в определенном каталоге
	 * 
	 * boolean mkdir(): создает новый каталог и при удачном создании возвращает
	 * значение true
	 * 
	 * boolean renameTo(File dest): переименовывает файл или каталог
	 */
	
	 // определяем объект для каталога
    File dir = new File("C:\\repositories\\TMS\\TeachMeSkills");
    // если объект представляет каталог
    if(dir.isDirectory())
    {
        // получаем все вложенные объекты в каталоге
        for(File item : dir.listFiles()){
          
             if(item.isDirectory()){
                  
                 System.out.println(item.getName() + "  \t folder");
             }
             else{
                  
                 System.out.println(item.getName() + "\t file");   
             }
         }
    }
    
/*Пример сериализации, десериализации*/    
    File serialization = new File("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\serilazation.txt");
	serialization.createNewFile();
try{
//	System.out.println(serialization.getAbsoluteFile().toString());
	String pathname = serialization.getAbsoluteFile().toString();
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathname)); /*В конструктор передаем поток вывода, в который производится запись*/
	Person p1 = new Person ("Sam", 23, 178, true);
	oos.writeObject(p1);
} catch (Exception e) {
	System.out.println("Что-то пошло не так");
}
/*Десериализация. Класс ObjectInputStream*/
/*Класс ObjectInputStream отвечает за обратный процесс - чтение ранее сериализованных данных из потока. В конструкторе он принимает ссылку
 *на поток ввода*/
try {
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serialization));
	Person p1 = (Person)ois.readObject();
	System.out.println(p1.toString());
} catch (Exception e) {
	System.out.println("Что-то пошло не так");
}

       
}
}
/*Сериализация*/
/*Сразу стоит отметить, что сериализовать можно только те объекты, которые реализуют интерфейс Serializable. Этот
 *интерфейс не содержит никаких методов и просто является маркером*/ 
/*Для сериализации объектов в поток используется класс ObjectOutputStream. Он записывает данные в поток. Для создания объекта
 *ObjectOutputStream в конструктор передается поток, в который производится запись */
class Person implements Serializable{
	private String name;
	private int age;
	private double height;
	private boolean married;
	
		public Person(String name, int age, double height, boolean married) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.married = married;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public boolean isMarried() {
			return married;
		}

		public void setMarried(boolean married) {
			this.married = married;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", height=" + height + ", married=" + married + "]";
		}	
		
}
    
























