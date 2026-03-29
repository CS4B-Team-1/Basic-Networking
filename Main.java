public class Main {
    Thread thread1 = new Thread(new Router());
    Thread thread2 = new MyClient();

    thread1.start();
    thread2.start();
}
