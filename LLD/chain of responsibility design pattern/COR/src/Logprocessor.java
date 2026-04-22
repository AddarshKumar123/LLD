public abstract class Logprocessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    Logprocessor nextLogProcessor;

    Logprocessor(Logprocessor logprocessor){
        this.nextLogProcessor=logprocessor;
    }

    public void log(int log,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(log,message);
        }
    }
}
