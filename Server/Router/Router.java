package Server.Router;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import Server.Message.Message;

public class Router implements Runnable{

    private int port = 8080;
    private Set<ClientConnection> connections = ConcurrentHashMap.newKeySet();
    private Set<Thread> threads = ConcurrentHashMap.newKeySet();

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected new client");

                ClientConnection connection = new ClientConnection(this, socket);
                connections.add(connection);

                Thread thread = new Thread(connection);
                threads.add(thread);
                thread.start();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendMessage(Message message, ClientConnection connection) throws IOException {
        // loop through conenctions, 
        for (ClientConnection conn : this.connections) {
            // send message to each connection that ISN'T the sender
            if (conn != connection)
                conn.send(message);
        }
    }
}
