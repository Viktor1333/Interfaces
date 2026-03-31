
void main() {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter host name: ");
        String host = scan.nextLine();
        try {
            InetAddress add = InetAddress.getByName(host);
            System.out.println("Host address: " + add.getHostAddress());
            System.out.println("Canonical host name: "+ add.getCanonicalHostName());
            boolean reachable = add.isReachable(5000);
            System.out.println("Is reachable in 5sec: "+ reachable);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
}
