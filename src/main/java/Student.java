import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Student implements Serializable {
    private String name, group;
    private char sex;
    private int birthDate, birthMonth, birthYear;

    public Student(String name, String group, char sex, int birthDate, int birthMonth, int birthYear) {
        this.name = name;
        this.group = group;
        this.sex = sex;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                        + "Group:" + group + "\n"
                        + "Sex: " + sex + "\n"
                        + "Birthday: " + birthDate + "." + birthMonth + "." + birthYear + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                birthDate == student.birthDate &&
                birthMonth == student.birthMonth &&
                birthYear == student.birthYear &&
                name.equals(student.name) &&
                group.equals(student.group);
    }

    @Override
    public int hashCode() {
        int hash = 42 + 7 * sex * birthDate * birthMonth * birthYear;
        for (char c : name.toCharArray()) hash += c;
        for (char c : group.toCharArray()) hash += c;
        return hash;
    }
}
