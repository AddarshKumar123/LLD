public class DJB2HashFunction implements HashFunction<String>{
    @Override
    public int hash(String value) {

        long hash = 5381;

        for(char c : value.toCharArray()) {
            hash = ((hash << 5) + hash) + c;
        }

        return (int) hash;
    }
}
