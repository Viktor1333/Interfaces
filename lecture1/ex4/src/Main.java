import java.io.IOException;
import java.nio.file.*;

void main() {
    Path dir = Paths.get(".");
    try{
        if(!Files.exists(dir)){
            System.out.println("Directory doesn't exist");
        }
        if(!Files.isDirectory(dir)){
            System.out.println("Directory doesn't exist");
        }
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            if(stream.iterator().hasNext()){
                System.out.println("Directory is not empty");
            }
            else{
                System.out.println("Directory is empty");
            }
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
