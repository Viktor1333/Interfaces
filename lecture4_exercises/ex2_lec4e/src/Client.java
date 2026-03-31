import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8080;


    public static void main(String[] args) {
        try{
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader inUser = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.println("Enter number 1: ");
                String num1 = inUser.readLine();
                if(num1.equalsIgnoreCase("exit")){
                    System.out.println("Goodbye!");
                    break;
                }
                out.println(num1);
                System.out.println("Enter number 2: ");
                String num2 = inUser.readLine();
                out.println(num2);
                System.out.println("Enter operator: ");
                String op = inUser.readLine();
                out.println(op);

                String message = in.readLine();
                System.out.println("Operation value: "+ message);

            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}