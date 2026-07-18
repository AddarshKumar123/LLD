import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> documents=new ArrayList<>();

    public void addElements(DocumentElement documentElement){
        documents.add(documentElement);
    }

    public String render(){
        String result="";
        for(DocumentElement document:documents){
            result+=document.render();
        }

        return result;
    }

}
