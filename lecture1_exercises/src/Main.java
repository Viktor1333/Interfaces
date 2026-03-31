
void main() {
        long time = System.currentTimeMillis();
        String name = "file_"+ time + ".txt";
        File file = new File(name);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
        System.out.println("File name: " + name);
        System.out.println("FIle absolute location: " + file.getAbsolutePath());
        System.out.println("File relative location: "+ file.getPath());
        System.out.println("File can read: "+ file.canRead());
        System.out.println("File can write: "+ file.canWrite());
        System.out.println("Parent name: "+ file.getAbsoluteFile().getParent());
}
