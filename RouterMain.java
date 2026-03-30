public class RouterMain {
    public static void main(String[] args) {

        Thread routerThread = new Thread(new Router());
        routerThread.start();
    }
}
