
void main() {
        Path path = Paths.get("test.txt");
        String text = "hello world";
        try{
            Files.write(path,text.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
}
