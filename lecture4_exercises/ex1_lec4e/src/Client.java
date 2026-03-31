import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8080;
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        BufferedReader inUser = null;
        try {
            System.out.println("Connecting to " + SERVER_ADDRESS + ":" + SERVER_PORT);
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            inUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number that you want to check");
            String number = inUser.readLine();
            out.println(number);
            String message = in.readLine();
            System.out.println(message);

        }catch (Exception e){

        }
    }

}
