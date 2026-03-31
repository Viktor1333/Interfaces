void main(){
    try{
       ServerSocket serverSocket = new ServerSocket(8080);
       Socket clientSocket = serverSocket.accept();
       PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
       BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
       int num1 = Integer.parseInt(input.readLine());

        if(num1 <= 1){
            out.println("Number is not prime");
            return;
        }
        if(num1 == 2){
            out.println("Number is prime");
            return;
        }
        if(num1 % 2 == 0){
            out.println("Number is not prime");
            return;
        }
        for(int i = 3; i < num1; i += 2){
            if(num1 % i == 0){
                out.println("Number is not prime");
                return;
            }
        }
        out.println("Number is prime");
    }catch(Exception e){
        e.printStackTrace();
    }
}