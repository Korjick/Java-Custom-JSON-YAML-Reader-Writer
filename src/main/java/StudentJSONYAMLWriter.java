import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class StudentJSONYAMLWriter extends Writer {

    private ObjectMapper mapper;
    private FileWriter writer;
    private String type;

    public StudentJSONYAMLWriter(Path directory, String filename, String type) throws IOException {
        if(type.trim().toLowerCase().equals("yaml")) this.type = "yaml";
        else this.type = "json";

        mapper = new ObjectMapper();
        if(Files.isDirectory(directory))
            writer = new FileWriter(directory.toAbsolutePath().normalize().resolve(filename).toString() + "." + type);
        else throw new IOException("Неправильно указан путь к папке");
    }

    public void writeJSONYAMLStudent(Student s) throws IOException {
        mapper.writeValue(writer, s);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        writer.write(str, off, len);
    }

    public void flush() throws IOException {
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        writer.write(cbuf);
    }

    @Override
    public void write(String str) throws IOException {
        writer.write(str);
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        return writer.append(csq);
    }

    @Override
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        return writer.append(csq, start, end);
    }

    @Override
    public Writer append(char c) throws IOException {
        return writer.append(c);
    }

    public String getEncoding() {
        return writer.getEncoding();
    }

    @Override
    public void write(int c) throws IOException {
        writer.write(c);
    }
}
