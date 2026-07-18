public class ImageElement implements DocumentElement {
    public String imagePath;
    ImageElement(String imagePath){
        this.imagePath=imagePath;
    }

    @Override
    public String render() {
        return "[Image: " + imagePath + " ]";
    }
}
