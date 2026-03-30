import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient implements Runnable {
    private int port;
    private Socket socket;
    private ObjectOutputStream outgoingMessageStream; // message that the client wants to send
    private ObjectInputStream serverResponseStream; // input from server

    public MyClient(String host, int port) throws IOException {
        this.port = port;
        this.socket = new Socket(host, port);
    }

    public void run() {
        try {
            outgoingMessageStream = new ObjectOutputStream(socket.getOutputStream());
            serverResponseStream = new ObjectInputStream(socket.getInputStream());

            int responsesReceived = 0;

            while(responsesReceived < 5) {
                outgoingMessageStream.writeObject(new Message("outgoing client message #" + (responsesReceived + 1)));
                outgoingMessageStream.flush();

                Message incomingMessage = null;
                while (incomingMessage == null) {
                    incomingMessage = (Message) serverResponseStream.readObject();
                }
                System.out.println(incomingMessage.getMessage());
                responsesReceived++;
            }

            serverResponseStream.close();
            outgoingMessageStream.close();
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
