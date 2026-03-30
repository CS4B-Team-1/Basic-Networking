import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient implements Runnable {

    private String name;
    private int port;
    private Socket socket;
    private ObjectOutputStream outgoingMessageStream; // message that the client wants to send
    private ObjectInputStream serverResponseStream; // input from server

    public MyClient(String host, int port, String name) throws IOException {
        this.port = port;
        this.socket = new Socket(host, port);
        this.name = name;
    }

    public void run() {
        try {
            outgoingMessageStream = new ObjectOutputStream(socket.getOutputStream());
            serverResponseStream = new ObjectInputStream(socket.getInputStream());

            int messagesSent = 0;

            while(messagesSent < 5) {
                outgoingMessageStream.writeObject(new Message("outgoing client message #" + (messagesSent + 1) + " from " + name));
                outgoingMessageStream.flush();

                Message incomingMessage = null;

                do { 
                    incomingMessage = (Message) serverResponseStream.readObject();
                    System.out.println(name + " receiving " + incomingMessage.getMessage());
                } while (serverResponseStream.available() != 0);

                messagesSent++;
            }

            serverResponseStream.close();
            outgoingMessageStream.close();
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
