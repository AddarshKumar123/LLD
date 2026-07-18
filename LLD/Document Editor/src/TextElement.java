public class TextElement implements DocumentElement {
    public String text;

    TextElement(String text){
        this.text=text;
    }
    @Override
    public String render() {
        return text;
    }
}
