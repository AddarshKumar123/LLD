public class Main {
    public static void main(String[] args) {
        User user=new User.Builder("Addarsh","21")
                .email("xyz@gmail.com")
                .phone("123456789")
                .build();
        System.out.println(user.getUser());
    }
}