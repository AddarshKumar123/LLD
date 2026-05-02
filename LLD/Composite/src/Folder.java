import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    String name;
    List<FileSystem>files=new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public void add(FileSystem fs){
        files.add(fs);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: "+ name);

        for(FileSystem fs:files){
            fs.showDetails();
        }
    }
}
