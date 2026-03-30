import java.io.IOException;

public class ClientMain {
    public static void main(String[] args) {
        try {
            MyClient client1 = new MyClient("localhost", 8080);
            MyClient client2 = new MyClient("localhost", 8080);
            // MyClient client3 = new MyClient("localhost", 8080);
            // MyClient client4 = new MyClient("localhost", 8080);

            Thread clientThread1 = new Thread(client1);
            Thread clientThread2 = new Thread(client2);
            // Thread clientThread3 = new Thread(client3);
            // Thread clientThread4 = new Thread(client4);

            clientThread1.start();
            clientThread2.start();
            // clientThread3.start();
            // clientThread4.start();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
