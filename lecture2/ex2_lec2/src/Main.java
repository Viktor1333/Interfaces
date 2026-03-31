import java.net.InetAddress;
import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter domain name: ");
    String domain = scan.nextLine();
    try{
        InetAddress[] add = InetAddress.getAllByName(domain);
        for(InetAddress addr : add){
            System.out.println(addr.getHostAddress());
        }
    }catch(IOException e){
        System.out.println("Can't get all addresses");
    }
}
