import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Connect {
    public static void main(String[] args) throws IOException {
        Connect connect = new Connect();
        int port = connect.startServer();
        connect.startClient(port);
    }

    private void startClient(int port) throws IOException {
//        new Socket("localhost", port);
        new Socket("127.0.0.1", port);
        System.out.println("Client connected");
    }

    private int startServer() throws IOException {
        final ServerSocket ss = new ServerSocket(0);
        int localPort = ss.getLocalPort();
        
        new Thread(new Runnable() {
            public void run() {
                try {
                    Socket socket = ss.accept();
                    InetAddress inetAddress = socket.getInetAddress();
                    System.out.println("Server accepted connection from: " + inetAddress.getCanonicalHostName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        return localPort;
    }
}