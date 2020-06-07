import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println("Dobry den");

        ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Math", "History", "Physics"));
        Teacher teacher1 = new Teacher("Bob", 41, subjects);
        Student student1 = new Student("Alice", 3, subjects);

        teacher1.setAge(55);
        teacher1.setName("Gayboy");
        student1.setGrade(2);
        student1.setName("Karel");

        int b = 4;
        int vypocet;
        vypocet = soucet(b);

        int cyklus = 0;
        for (int i = 1; i < 10; i++) {
            cyklus += i;
        }
        System.out.println(cyklus);
    }

    private static int soucet(int b) {
        int a = 5;
        return a + b;
    }
}
