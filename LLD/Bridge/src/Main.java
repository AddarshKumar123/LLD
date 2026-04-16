public class Main {
    public static void main(String[] args) {
        Device tv=new TV();
        Remote basicRemote=new BasicRemote(tv);
        basicRemote.power();

        Remote advancedRemote=new AdvancedRemote(tv);
        advancedRemote.power();

    }
}