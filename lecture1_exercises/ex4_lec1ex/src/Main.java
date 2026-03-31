
void main() {
        Path dir = Paths.get(".");
        if(!Files.exists(dir)){
            System.out.println("Directory doesn't exist");
        }
        if(!Files.isDirectory(dir)){
            System.out.println("Directory is not a directory");
        }
        try(DirectoryStream<Path> path = Files.newDirectoryStream(dir)){
            if(!path.iterator().hasNext()){
                System.out.println("Directory is empty");
            }
            else{
                System.out.println("Directory found and is not empty");
            }
        }catch(IOException e){
            System.out.println("Directory stream exception");
        }
}
