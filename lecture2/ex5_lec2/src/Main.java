    import java.awt.Desktop;
    import java.io.File;
    void main() {
        try{
            File file = new File("/Users/viktorstojkovski/Desktop/Databazihm1.pages");
            if(Desktop.isDesktopSupported()){
                Desktop desk = Desktop.getDesktop();
                desk.open(file);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
