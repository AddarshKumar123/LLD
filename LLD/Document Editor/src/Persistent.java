import java.io.IOException;

public interface Persistent {
    public void save(String data) throws IOException;
}
