public class DebugLogProcessor extends Logprocessor{

    DebugLogProcessor(Logprocessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int log,String message){
        if(log==DEBUG){
            System.out.println(message);
        }else{
            super.log(log,message);
        }
    }
}
