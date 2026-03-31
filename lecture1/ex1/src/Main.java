
void main() throws IOException{
    long time = System.currentTimeMillis();
    String name = "file_"+ time + ".txt";
    File file = new File(name);
    try{
        if(file.exists()){
            System.out.println("File already exists");
        }
        else{
            file.createNewFile();
            System.out.println("File created");
        }
        System.out.println("FIle name: "+ name);
        System.out.println("File absolute location: "+ file.getAbsolutePath());
        System.out.println("File relative location: "+ file.getPath());
        System.out.println("File size: "+ file.length());
        System.out.println("File is regular file: "+ file.isFile());
        System.out.println("File is directory: "+ file.isDirectory());
        System.out.println("File last modified time stamp: "+ file.lastModified());
        System.out.println("FIle permissions: "+ file.canWrite());
        System.out.println("File permissions: "+ file.canRead());
    }catch(IOException e){
        e.printStackTrace();
    }
}
