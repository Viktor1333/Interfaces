import java.net.URL;
void main() {
        try{
            URL url = new URL("https://uacs.edu.mk/home/home/");
            System.out.println("getAuthority(): " + url.getAuthority());
            System.out.println("getContent(): " + url.getContent());
            System.out.println("getDefaultPort(): " + url.getDefaultPort());
            System.out.println("getFile(): " + url.getFile());
            System.out.println("getHost(): " + url.getHost());
            System.out.println("getPath(): " + url.getPath());
            System.out.println("getPort(): " + url.getPort());
            System.out.println("getProtocol(): " + url.getProtocol());
            System.out.println("getQuery(): " + url.getQuery());
            System.out.println("toString(): " + url.toString());
    }catch(Exception e){}
}
