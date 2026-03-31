import java.net.InetAddress;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

void main() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter command: (props/dns/compare)");
        String command = sc.nextLine();
        if (command.equals("props")) {
            System.out.println("Enter file name:");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            Path path = Paths.get(fileName);
            if(!file.exists()){
                System.out.println("File does not exist");
                return;
            }
            System.out.println("FIle name: "+ fileName);
            System.out.println("File absolute location: "+ file.getAbsolutePath());
            System.out.println("File relative location: "+ file.getPath());
            System.out.println("File size: "+ file.length());
            System.out.println("File is regular file: "+ file.isFile());
            System.out.println("File is directory: "+ file.isDirectory());
            System.out.println("File last modified time stamp: "+ file.lastModified());
            System.out.println("FIle permissions: "+ file.canWrite());
            System.out.println("File permissions: "+ file.canRead());

        }
        else if (command.equals("dns")) {
            System.out.println("Enter domain: ");
            String domain = sc.nextLine();
            InetAddress[] ips = InetAddress.getAllByName(domain);
            System.out.println("Domain: "+ domain + " has: "+ ips.length + " addresses");
            for (InetAddress ip : ips) System.out.println(ip.getHostAddress());
        }
        else if (command.equals("compare")) {
            System.out.println("Enter file name 1:");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            Path path = Paths.get(fileName);
            System.out.println("Enter file name 2: ");
            String fileName2 = sc.nextLine();
            File file2 = new File(fileName2);
            Path path2 = Paths.get(fileName2);
            if(!file.exists() || !file2.exists()){
                System.out.println("One of the files does not exist");
                return;
            }
            boolean identical = Arrays.equals(Files.readAllBytes(path), Files.readAllBytes(path2));
            System.out.println("Files are identical: " + identical);
        }
        else{
            System.out.println("Unknown command");
        }
}
