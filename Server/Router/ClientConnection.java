package Server.Router;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.Message;

public class ClientConnection implements Runnable {
    
    private ObjectInputStream incomingClientStream;
    private ObjectOutputStream serverResponseStream;
    private Router router;
    private Socket clientSocket;

    public ClientConnection(Router router, Socket clientSocket) {
        this.router = router;
        this.clientSocket = clientSocket;
    } 

    /*
    1. Are we supposed to create an outputstream from an inputstream and vice versa like last lecture?
    2. Why must outputStream be created before InputStream?
    3. Is there a concurrency issue with ClientConnection and MyClient having access to the same socket's
        input and outputstreams
        a. how does Router's ClientConnection ConcurrentHashmap affect that?
        -> when there's more than 2 clients, the program breaks

    
    Maybe there needs to be a singal sent between the ClientConnection and MyClient to tell when 
    a .readObject()/.writeObject() is safe to perform?

    */

    public void run() {

        try {
            serverResponseStream = new ObjectOutputStream(clientSocket.getOutputStream());
            incomingClientStream = new ObjectInputStream(clientSocket.getInputStream());

            Message clientMessage = null;
            while(!clientSocket.isClosed()) { // while the connection hasn't closed yet
                // listen for message
                clientMessage = (Message) incomingClientStream.readObject();
                // use router to send message
                if (clientMessage != null) {
                    router.sendMessage(clientMessage, this);
                    clientMessage = null;
                }
            }

            incomingClientStream.close();
            serverResponseStream.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void send(Message message) throws IOException {
        // send message through the outputstream to the client
        serverResponseStream.writeObject(message);
    }
}
