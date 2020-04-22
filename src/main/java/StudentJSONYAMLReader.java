import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public class StudentJSONYAMLReader extends Reader {

    FileReader reader;
    ObjectMapper mapper;

    public StudentJSONYAMLReader(String path) throws FileNotFoundException {
        reader = new FileReader(path);
        mapper = new ObjectMapper();
    }

    public Student readJSONYAMLStudent() throws IOException {
        return mapper.readValue(reader, Student.class);
    }

    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    @Override
    public boolean ready() throws IOException {
        return reader.ready();
    }

    public void close() throws IOException {
        reader.close();
    }

    @Override
    public int read(CharBuffer target) throws IOException {
        return reader.read(target);
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        return reader.read(cbuf);
    }

    @Override
    public long skip(long n) throws IOException {
        return reader.skip(n);
    }

    @Override
    public boolean markSupported() {
        return reader.markSupported();
    }

    @Override
    public void mark(int readAheadLimit) throws IOException {
        reader.mark(readAheadLimit);
    }

    @Override
    public void reset() throws IOException {
        reader.reset();
    }

    public String getEncoding() {
        return reader.getEncoding();
    }

    @Override
    public int read() throws IOException {
        return reader.read();
    }
}
