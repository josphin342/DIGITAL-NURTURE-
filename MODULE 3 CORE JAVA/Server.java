import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server is listening on port 12345...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        String message;
        while ((message = input.readLine()) != null) {
            System.out.println("Client: " + message);
            output.println("Server: " + message.toUpperCase());
        }

        socket.close();
        serverSocket.close();
    }
}

