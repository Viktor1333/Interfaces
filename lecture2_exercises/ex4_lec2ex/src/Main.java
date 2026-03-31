
void main() {
    try {
        URL url = new URL("https://uacs.edu.mk");
        InputStream in = url.openStream();
        FileOutputStream out = new FileOutputStream("file1.txt");

        byte[] b = new byte[1024];
        int len;

        while((len = in.read(b)) != -1){
            out.write(b,0,len);
        }
        System.out.println("File written");
    }catch(IOException e){
        e.printStackTrace();
    }

}
