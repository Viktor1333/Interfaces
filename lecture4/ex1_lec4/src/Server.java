void main() {
    try {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server is listening onj port 8080");

        Socket connectionSocket = serverSocket.accept();
        System.out.println("Connection is established with client: "+ connectionSocket.getInetAddress());

        PrintWriter output = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()),true);
        BufferedReader input = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

        String message = input.readLine();
        System.out.println("Message from client: " + message);

        output.println("Hello client");

        int num1 = Integer.parseInt(input.readLine());
        System.out.println("Client sent num: " + num1);
        int num2 = Integer.parseInt(input.readLine());
        System.out.println("Client sent num: " + num2);

        int sum = num1 + num2;

        output.println(sum);

        System.out.println("Sent sum to client: " + sum);

    }catch(IOException e) {
        e.printStackTrace();
    }
}