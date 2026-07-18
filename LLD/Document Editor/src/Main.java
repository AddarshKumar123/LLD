import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document=new Document();
        Persistent persistent=new FileStorage();

        DocumentEditor documentEditor=new DocumentEditor(document,persistent);

        documentEditor.addText("hello");
        documentEditor.addImage("img.jgp");

        documentEditor.SaveDocument();
    }
}