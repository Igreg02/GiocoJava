import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connessione {

    public static void Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        String message = new String(bytes, 0, length);
        System.out.println("Messaggio ricevuto dal client: " + message);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Messaggio di risposta dal server".getBytes());
        socket.close();
        serverSocket.close();
    }

    public static void Client() throws IOException {
        Socket socket = new Socket("localhost", 8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Messaggio dal client il robbie salta sulle cappelle".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        String message = new String(bytes, 0, length);
        System.out.println("Messaggio ricevuto dal server: " + message);
        socket.close();
    }
}