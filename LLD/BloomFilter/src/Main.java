import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HashFunction<String>> hashFunctions=new ArrayList<>();
        hashFunctions.add(new DJB2HashFunction());
        hashFunctions.add(new JavaHashFunction());
        hashFunctions.add(new PolynomialHashFunction());

        BloomFilter<String> bloomFilter=new BloomFilter(100,hashFunctions);


    }
}