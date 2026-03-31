import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
void main() {
    Path path = Paths.get("appendText.txt");

    String textToAppend = "This text is appended to the file.\n";
    try{
        Files.write(path, textToAppend.getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        System.out.println("File written");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
