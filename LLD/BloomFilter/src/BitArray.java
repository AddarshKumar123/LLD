import java.util.BitSet;

public class BitArray {
    private final BitSet bits;

    public BitArray(int size){
        bits=new BitSet(size);
    }

    public void setBits(int index){
        bits.set(index);
    }

    public boolean isSetBit(int index) {
        return bits.get(index);
    }
}
