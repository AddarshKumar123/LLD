import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements Persistent {

    @Override
    public void save(String data) throws IOException {
        try {
            FileWriter obj = new FileWriter("Document.txt");
            obj.write(data);
            obj.close();
            System.out.println("Successfully written");
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.getMessage();
        }
    }
}
