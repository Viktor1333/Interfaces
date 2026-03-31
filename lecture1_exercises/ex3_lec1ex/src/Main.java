
void main() {
        Path dir = Paths.get(".");
        String extension = ".txt";
        try(Stream<Path> files = Files.walk(dir)){
            files.filter(Files :: isRegularFile)
                    .filter(p -> p.toString().endsWith(extension))
                    .forEach(p -> System.out.println(p.toString()));
        }catch(IOException ex){
            ex.printStackTrace();
        }
}
