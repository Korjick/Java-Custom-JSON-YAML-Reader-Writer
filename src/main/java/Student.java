import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

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
}
