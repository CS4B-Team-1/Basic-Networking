package Server.Client.Receiver;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.Message;

public class SenderClient1 {
    private int port;
    private String name;
    private Socket socket;
    private ObjectOutputStream outgoingMessageStream; 


    public SenderClient1(int p, String n) throws IOException {
        this.port = p;
        this.name = n;

        //local host is hard coded
        this.socket = new Socket("localhost", port);
        this.outgoingMessageStream = new ObjectOutputStream(socket.getOutputStream());
        
    }

    public static void main(String[] args) {

        /*
            SENDER CLIENT 1:
        */

        int messagesSent = 0;
        try {
            SenderClient1 senderClient1 = new SenderClient1(8080, "Sender Client 1");

            while(true) {
                senderClient1.sendMessage(new Message("outgoing client message #" + (messagesSent + 1) + " from " + senderClient1.name));

                messagesSent++;
            } 

        } catch (IOException e) {
            System.out.println("Exception thrown while read/write of incoming/outgoing MyClient Message: " + e.getMessage());
        }
        
        
        //Call methods to close the threads/Sockets/IO streams
        // SenderClient.outgoingMessageStream.close();
        // this.socket.close();

    }

    public void sendMessage(Message message) throws IOException {
        //example made message
        //new Message("outgoing client message #" + (messagesSent + 1) + " from " + name
        outgoingMessageStream.writeObject(message);
        outgoingMessageStream.flush();
    }


}