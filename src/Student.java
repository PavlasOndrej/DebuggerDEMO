import java.util.ArrayList;

public class Student {
    String name;
    int grade;
    ArrayList<String> subjects = new ArrayList<>();

    public Student(String name, int grade, ArrayList<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
}
