import java.util.List;
public class Student {
    private String name;
    private int age;
    private String email;
    private List<String> courses;


    public Student(String name, int age, String email, List<String> courses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.courses = courses;
    }

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
