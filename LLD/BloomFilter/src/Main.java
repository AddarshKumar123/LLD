import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HashFunction<String>> hashFunctions=new ArrayList<>();
        hashFunctions.add(new DJB2HashFunction());
        hashFunctions.add(new JavaHashFunction());
        hashFunctions.add(new PolynomialHashFunction());

        BloomFilter<String> bloomFilter=new BloomFilter(100,hashFunctions);

        bloomFilter.add("Addarsh");
        bloomFilter.add("Aditya");
        bloomFilter.add("Aman");

        System.out.println(bloomFilter.mightContain("Apple"));
        System.out.println(bloomFilter.mightContain("Aman"));
        System.out.println(bloomFilter.mightContain("Aditya"));
    }
}