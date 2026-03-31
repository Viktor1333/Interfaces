import java.io.*;
import java.net.*;

void main(){
    try{
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started");
        while(true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String line;
            while((line = in.readLine()) != null){

            int num1 = Integer.parseInt(line);
            int num2 = Integer.parseInt(in.readLine());
            String op  = in.readLine();
            if(op.equals("+")){
                int sum = num1 + num2;
                out.println(sum);
            }
            else if(op.equals("-")){
                int diff = num1 - num2;
                out.println(diff);
            }
            else if(op.equals("*")){
                int product = num1 * num2;
                out.println(product);
            }
            else if(op.equals("/")){
                int quotient = num1 / num2;
                out.println(quotient);
            }
        }}
    }catch(IOException e){
        e.printStackTrace();
    }
}