import java.io.*;
import java.net.*;

public class Client {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {

        Socket clientSocket = null;
        PrintWriter output = null;
        BufferedReader input = null;
        BufferedReader inputFromUser = null;

        try {

            System.out.println("Connecting to server " + SERVER_ADDRESS + ":" + SERVER_PORT);

            clientSocket = new Socket(SERVER_ADDRESS, SERVER_PORT);

            output = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            inputFromUser = new BufferedReader(new InputStreamReader(System.in));

            output.println("Hello server");

            String message = input.readLine();
            System.out.println("Message from server: " + message);

            System.out.println("Enter number 1:");
            String num1 = inputFromUser.readLine();
            output.println(num1);

            System.out.println("Enter number 2:");
            String num2 = inputFromUser.readLine();
            output.println(num2);

            String result = input.readLine();
            System.out.println("Result from server: " + result);



        } catch (UnknownHostException e) {
            System.out.println("Cannot connect");
        } catch (IOException e) {
            System.out.println("I/O error");
        }
    }
}