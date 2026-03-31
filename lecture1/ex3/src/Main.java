import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;
void main() {
    Path dir = Paths.get(".");
    String extension = ".txt";
    try(Stream<Path> paths = Files.walk(dir)){
        paths.filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(extension))
                .forEach(p -> System.out.println(p.toString()));
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
