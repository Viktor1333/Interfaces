import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8080;


    public static void main(String[] args) {
        try{
                Socket clientSocket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//              PrintWriter fileWriter = new PrintWriter(new FileWriter("output.txt"));
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//              BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"));
                BufferedReader inputFromUser = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of elements: ");
                int n  = Integer.parseInt(inputFromUser.readLine());
                out.println(n);
                for(int i = 0; i < n;i++){
                    System.out.print("Enter element " + (i+1) + ": ");
                    out.println(inputFromUser.readLine());
                }


                for(int i = 0; i < n; i++){
                    double k = Double.parseDouble(in.readLine());
                    System.out.println(k);
                }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}