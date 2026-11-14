package homework_lesson19;

/* Описание (2026): минимальный пример создания потока из лямбды Runnable; без join() главный поток завершается раньше дочернего "MyThread". */
public class Program {
	  
    public static void main(String[] args) {
          
        System.out.println("Main thread started...");
        Runnable r = ()->{
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(r,"MyThread");
        myThread.start();
        System.out.println("Main thread finished...");
    }
}