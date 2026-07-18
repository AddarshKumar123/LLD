public class PolynomialHashFunction implements HashFunction<String>{

    @Override
    public int hash(String value) {
        int hash = 0;
        int prime = 31;

        for(char c : value.toCharArray()) {
            hash = hash * prime + c;
        }

        return hash;
    }
}
