public class Main {
    public static void main(String[] args) {
        LRUcache lrUcache=new LRUcache(3);
        lrUcache.put(1,1);
        lrUcache.put(2,2);
        lrUcache.put(3,3);
        lrUcache.itr();

        lrUcache.get(2);
        lrUcache.itr();
    }
}