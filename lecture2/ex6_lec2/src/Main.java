import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
void main() {
    try {

       String recipient = "anastasijanikk@gmail.com";
       String subject = "Anastasija te sakam";
       String body = "Atanas porakava ti ja prakjam preku url link kako vezba za kodiranje so java>TESAKAM";
       String enSub = URLEncoder.encode(subject, "UTF-8");
       String enBody = URLEncoder.encode(body, "UTF-8");
       String mailto = "mailto:" + recipient +
               "?subject=" + enSub + "&body=" + enBody;

       URI mailURI = new URI(mailto);
       if(Desktop.isDesktopSupported()) {
           Desktop desk =  Desktop.getDesktop();
           desk.mail(mailURI);
       }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
