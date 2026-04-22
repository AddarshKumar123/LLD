public class InfoLogProcessor extends Logprocessor {

    InfoLogProcessor(Logprocessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int log,String message){
        if(log==INFO){
            System.out.println(message);
        }else{
            super.log(log,message);
        }
    }
}
