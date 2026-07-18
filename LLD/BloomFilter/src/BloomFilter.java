import java.util.List;
import java.util.Map;

public class BloomFilter<T> {
    public final BitArray bitArray;
    public final List<HashFunction<T>> hashFunctions;
    public final int size;

    public BloomFilter(int size,List<HashFunction<T>> list){
        bitArray=new BitArray(size);
        this.size=size;
        this.hashFunctions=list;
    }

    public void add(T value){
        for(HashFunction<T>hashFunction:hashFunctions){
            int hash=Math.abs(hashFunction.hash(value));
            int index=hash%size;

            bitArray.setBits(index);
        }
    }

    public boolean mightContain(T value){
        for(HashFunction<T>hashFunction:hashFunctions){
            int hash= Math.abs(hashFunction.hash(value));
            int index=hash%size;

            if(!bitArray.isSetBit(index)){
                return false;
            }
        }
        return true;
    }
}
