public class Main {
    public static void main(String[] args) {
        User original=new User("Raj",20);
        User copy=original.clone();

        System.out.println(original);
        System.out.println(copy);
    }
}