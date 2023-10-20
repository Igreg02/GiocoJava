import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void start() throws IOException {
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
}