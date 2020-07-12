import java.util.Scanner;
//изучаем многопоточность
public class flow {
    public static void main(String[] args) {
MyThread myThread = new MyThread();
myThread.start();   //запускает поток
        Scanner scanner = new Scanner(System.in);  // ввод
        scanner.nextLine();
        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    public void run() {  // метод процесса потока
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){ //завершает поток
        this.running = false;
    }
}