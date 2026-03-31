
void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the domain name: ");
        String domain = scan.nextLine();

        try{
            InetAddress[] add = InetAddress.getAllByName(domain);
            for(InetAddress addr : add){
                System.out.println(addr.getHostAddress());
            }
        }catch(Exception e){}
}
