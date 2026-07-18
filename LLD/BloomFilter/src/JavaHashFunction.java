public class JavaHashFunction implements HashFunction<String> {

    @Override
    public int hash(String value){
        return value.hashCode();
    }
}
