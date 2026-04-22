public class Main {
    public static void main(String[] args) {
        Logprocessor obj=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        obj.log(3,"Error occured");
        obj.log(2,"Debuging the error");
        obj.log(1,"Successfully Ran the application");
    }
}