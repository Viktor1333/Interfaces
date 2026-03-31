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

            int n = Integer.parseInt(in.readLine());
            double[] arr= new double[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(in.readLine());
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-1; j++) {
                    if(arr[j] > arr[j+1]){
                        double temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }

            }
            for(int i = 0; i < n; i++){
                out.println(arr[i]);
            }
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}