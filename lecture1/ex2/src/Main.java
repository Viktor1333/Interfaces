import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get(".");
        try(Stream<String> lines = Files.lines(path)){
            long c = lines.count();
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}