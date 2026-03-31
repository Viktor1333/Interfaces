
void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter command: props/dns/compare");
    String command = scan.nextLine();
    if(command.equals("props")){
        try {
            System.out.println("Enter file name: ");
            String name = scan.nextLine();
            File f = new File(name);
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
            System.out.println("Name of file: " + name);
            System.out.println("File size: " + f.length());
            System.out.println("File absolute path: " + f.getAbsolutePath());
            System.out.println("File is regular file: "+ f.isFile());
            System.out.println("File is directory: "+ f.isDirectory());
            System.out.println("File last modified: " + f.lastModified());
            System.out.println("File can read: "+ f.canRead());
            System.out.println("File can write: "+ f.canWrite());
            System.out.println("File can execute: "+ f.canExecute());
        }catch (Exception e){
            System.out.println("Error");
        }
    }
    else if(command.equals("dns")){
        try{
            System.out.println("Enter domain name: ");
            String dir = scan.nextLine();
            InetAddress[] addresses = InetAddress.getAllByName(dir);
            int i = 0;
            for(InetAddress address : addresses){
                System.out.println(address.getHostAddress());
                i++;
            }
            System.out.println("Number of addresses: " + i);


        }catch (Exception e){
            System.out.println("Error");
        }
    }
    else if(command.equals("compare")){
        try{
            System.out.println("Enter file 1:");
            String file1 = scan.nextLine();
            File f1 = new File(file1);
            System.out.println("Enter file 2:");
            String file2 = scan.nextLine();
            File f2 = new File(file2);
            Path path = Paths.get(file1);
            Path path2 = Paths.get(file2);
            if(!f1.exists() || !f2.exists()){
                System.out.println("One of the files does not exist");
                return;
            }
            boolean identical = Arrays.equals(Files.readAllBytes(path), Files.readAllBytes(path2));
            System.out.println("Identical files: " + identical);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
