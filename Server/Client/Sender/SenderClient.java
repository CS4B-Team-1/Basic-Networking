package Server.Client.Sender;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.Message.Message;

public class SenderClient{
    private int port;
    private String name;
    private Socket socket;
    private ObjectOutputStream outgoingMessageStream; 


    public SenderClient(int p, String n) throws IOException {
        this.port = p;
        this.name = n;

        //local host is hard coded
        this.socket = new Socket("localhost", port);
        this.outgoingMessageStream = new ObjectOutputStream(socket.getOutputStream());
    }


    
        /*
            SENDER CLIENT: ONLY SENDS MESSAGES TO THE SERVER
        */
    public static void main(String[] args) {


        int messagesSent = 0;
        try {
            //Open socket connection
            SenderClient senderClient = new SenderClient(8080, "Sender Client");

            //infinite loop to send messages every second
            while(true) {
                senderClient.sendMessage(new Message("outgoing client message #" + (messagesSent + 1) + " from " + senderClient.name));

                Thread.sleep(1000);
                messagesSent++;
            } 

            //Call methods to close the threads/Sockets/IO streams
            // senderClient.socket.close();

        } catch (IOException e ) {
            System.out.println("Exception thrown while read/write of incoming/outgoing MyClient Message: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Exception thrown while sleeping: " + e.getMessage());
        }
        
        


    }

    public void sendMessage(Message message) throws IOException {
        //example made message
        //new Message("outgoing client message #" + (messagesSent + 1) + " from " + name
        outgoingMessageStream.writeObject(message);
        outgoingMessageStream.flush();
    }

}