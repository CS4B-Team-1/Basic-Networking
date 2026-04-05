package Server.Client.Receiver;

import java.io.IOException;

import Server.Message;

public class ReceiverClientMain {
    public static void main(String[] args) {
        ReceiverClient client = new ReceiverClient("localhost", 8080);

        while (true) {
            try {
                Message message = client.receive();
                System.out.println(message.getMessage());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
