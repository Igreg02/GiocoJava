import java.net.*;

public class IPfinder {

    public static void main(String[] args) throws UnknownHostException {
        // Ottieni l'indirizzo IP locale
        InetAddress inetAddress = InetAddress.getLocalHost();

        // Stampa l'indirizzo IP
        System.out.println("Il tuo indirizzo IP locale è: " + inetAddress.getHostAddress());
    }
}
