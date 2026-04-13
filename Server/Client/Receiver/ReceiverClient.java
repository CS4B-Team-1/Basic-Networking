package Server.Client.Receiver;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.Message.Message;

public class ReceiverClient {

    private String name;
    private int port;
    private Socket socket;
    private ObjectInputStream serverResponseStream; // input from server

    public ReceiverClient(String host, int port) {
        this.port = port;

        try {
            this.socket = new Socket(host, port);
        } catch (IOException e) {
            System.out.println("ReceiverClient error connecting to " + host + " on port " + port + " " + e.getMessage());
        }

        try {
            this.serverResponseStream = new ObjectInputStream(this.socket.getInputStream());
        } catch (IOException e) {
            System.out.println("ReceiverClient error accessing InputStream : " + e.getMessage());
        }
    }

    public Message receive() throws IOException, ClassNotFoundException {
        return (Message) this.serverResponseStream.readObject();
    }
}
