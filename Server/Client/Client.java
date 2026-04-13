package Server.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.Message.Message;

public class Client {
    private int port;
    private Socket socket;
    private String name;
    private ObjectInputStream serverResponseStream;
    private ObjectOutputStream outgoingMessageStream;

    public Client(String host, int port) {
        this.port = port;

        try {
            this.socket = new Socket(host, port);
        } catch (IOException e) {
            System.out.println("Error from " + this.name + " connecting to " + host + " on port " + port + " " + e.getMessage());
        }

        try {
            this.outgoingMessageStream = new ObjectOutputStream(this.socket.getOutputStream());
            this.serverResponseStream = new ObjectInputStream(this.socket.getInputStream());

        } catch (IOException e) {
            System.out.println("Error from " + this.name + " accessing InputStream / OutputStream : " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Client client = new Client("localhost", 8080);

        try {
            client.sendMessage(new Message(client.name + " inital message"));
            Thread.sleep(1000);
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }

        int messagesSent = 0;
        while(true) {

            try {
                Message message = client.receive();

                if (message != null) {
                    System.out.println(message.getMessage());

                    client.sendMessage(new Message("outgoing client message #" + (messagesSent + 1) + " from " + client.name));
                    Thread.sleep(1000);
                    messagesSent++;
                }
            } catch (IOException | InterruptedException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void sendMessage(Message message) throws IOException {
        //example made message
        //new Message("outgoing client message #" + (messagesSent + 1) + " from " + name
        outgoingMessageStream.writeObject(message);
        outgoingMessageStream.flush();
    }

    public Message receive() throws IOException, ClassNotFoundException {
        return (Message) this.serverResponseStream.readObject();
    }
}
