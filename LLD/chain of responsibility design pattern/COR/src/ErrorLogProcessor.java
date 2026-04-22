public class ErrorLogProcessor extends Logprocessor{

    ErrorLogProcessor(Logprocessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int log,String message){
        if(log==ERROR){
            System.out.println(message);
        }else{
            super.log(log,message);
        }
    }
}
