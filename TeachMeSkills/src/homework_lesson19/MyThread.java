package homework_lesson19;

public class MyThread implements Runnable{

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()); //Выводим только имя
		System.out.println(t);//Имя потока, его приоритет, имя группы потоков, к которой относится текущий (t.getThreadGroup().getName())
		System.out.println("========================");
		/*
		 * По умолчанию именем главного потока будет main.
		 * 
		 * Для управления потоком класс Thread предоставляет еще ряд методов. Наиболее
		 * используемые из них:
		 * 
		 * getName(): возвращает имя потока
		 * 
		 * setName(String name): устанавливает имя потока
		 * 
		 * getPriority(): возвращает приоритет потока
		 * 
		 * setPriority(int proirity): устанавливает приоритет потока. Приоритет является
		 * одним из ключевых факторов для выбора системой потока из кучи потоков для
		 * выполнения. В этот метод в качестве параметра передается числовое значение
		 * приоритета - от 1 до 10. По умолчанию главному потоку выставляется средний
		 * приоритет - 5.
		 * 
		 * isAlive(): возвращает true, если поток активен
		 * 
		 * isInterrupted(): возвращает true, если поток был прерван
		 * 
		 * join(): ожидает завершение потока
		 * 
		 * run(): определяет точку входа в поток
		 * 
		 * sleep(): приостанавливает поток на заданное количество миллисекунд
		 * 
		 * start(): запускает поток, вызывая его метод run()
		 */

		
		/*Для создания нового потока мы можем создать новый класс, либо наследуя его от класса Thread, 
		 *либо реализуя в классе интерфейс Runnable.*/
		System.out.println("Main thread started");
		//new JThread("JThread").start();
		for (int i = 0; i<5; i++) {
			new JThread("Jthread Ex1_" + i).start();
		}
		System.out.println("Main thread finished...");
		System.out.println("========================");
		
		/*При запуске потоков в примерах выше Main thread завершался до дочернего потока. 
		 *Как правило, более распространенной ситуацией является случай, когда Main thread завершается самым последним. 
		 *Для этого надо применить метод join(). В этом случае текущий поток будет ожидать завершения потока, 
		 *для которого вызван метод join:*/
		
		System.out.println("Main thread started");
		for (int i = 0; i<5; i++) {
		JThread t2 = new JThread("Jthread Ex2_" + i);
		t2.start();
			try {
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("Main thread finished");
		System.out.println("========================");
		
		/*Пример использовани Run*/
		System.out.println("Main thread started...");
		MyThread mt = new MyThread();
		Thread t3 = new Thread(mt, "MyThread");
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished...");
		System.out.println("========================");
		
		/*Поскольку Runnable фактически представляет функциональный интерфейс, 
		 *который определяет один метод, то объект этого интерфейса мы можем представить в виде лямбда-выражения или анонимного класса:*/
		
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.printf("%s started... \n", Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 System.out.printf("%s finished... \n", Thread.currentThread().getName());
			}
		};
		System.out.println("Main thread started...");
		Thread t4 = new Thread(r, "r thread example");
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished...");
		System.out.println("========================");
		
		Runnable r1 = () -> {
			System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
		};
	
		System.out.println("Main thread started...");
		Thread t5 = new Thread(r, "r1 thread example");
		t5.start();
		try {
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished...");
		System.out.println("========================");
		
	}
		
		/*
		 * Реализация интерфейса Runnable 
		 * Другой способ определения потока представляет реализация интерфейса Runnable. Этот интерфейс имеет один метод run:
		 * 
		 * interface Runnable{
		 * void run(); 
		 * } 
		 * В методе run() определяется весь тот код, который
		 * выполняется при запуске потока.
		 * 
		 * После определения объекта Runnable он передается в один из конструкторов
		 * класса Thread:
		 * 
		 * Thread(Runnable runnable, String threadName)
		 */
		
		/*переопределим метод run()*/
		@Override
		public void run() {
			 System.out.printf("%s started... \n", Thread.currentThread().getName());
		        try{
		            Thread.sleep(500);
		        }
		        catch(InterruptedException e){
		            System.out.println("Thread has been interrupted");
		        }
		        System.out.printf("%s finished... \n", Thread.currentThread().getName());

		}
}

class JThread extends Thread{
	JThread (String name){
		super(name);
	}
		
	public void run() {
		System.out.printf("%s started... \n", Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.printf("%s fiished... \n", Thread.currentThread().getName());	
	}
}
