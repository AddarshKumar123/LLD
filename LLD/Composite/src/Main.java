public class Main {
    public static void main(String[] args) {
        FileSystem file1=new File("file1.txt");
        FileSystem file2=new File("file2.txt");

        Folder folder1=new Folder("Documents");
        folder1.add(file1);
        folder1.add(file2);

        Folder root=new Folder("root");
        root.add(folder1);

        root.showDetails();
    }
}