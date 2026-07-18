import java.io.IOException;

public class DocumentEditor {
    private Document document;
    private Persistent persistent;
    private String renderedDocument;

    DocumentEditor(Document document,Persistent persistent){
        this.document=document;
        this.persistent=persistent;
    }

    public void addText(String text){
        document.addElements(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElements(new ImageElement(imagePath));
    }

    public String renderDocument(){
        if(renderedDocument==null || renderedDocument.isEmpty()) {
            renderedDocument=document.render();
        }
        return renderedDocument;
    }

    public void SaveDocument() throws IOException {
        persistent.save(renderDocument());
    }

}
