import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
void main() {
    Path path = Paths.get("binaryData.bin");
    byte[] data = {10,20,30,40,50};
    try{
        Files.write(path,data);
        System.out.println("File written");
        byte[] data2 = Files.readAllBytes(path);
        System.out.println("File read");
        System.out.println(Arrays.toString(data2));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
