import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            StudentJSONYAMLWriter writer = new StudentJSONYAMLWriter(Paths.get("../../"), "student", "json");
            StudentJSONYAMLReader reader = new StudentJSONYAMLReader(Paths.get("../../student.json"));

            writer.writeJSONYAMLStudent(new Student("Rinat", "11-902", 'M', 22, 11, 2001));
            Student student = reader.readJSONYAMLStudent();
            System.out.println(student);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
