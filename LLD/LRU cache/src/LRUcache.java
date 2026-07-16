import java.util.HashMap;
import java.util.Map;

public class LRUcache {
    public final int capacity;
    public final Map<Integer,Node> cache;
    public final LinkedList list;

    public LRUcache(int capacity) {

        this.capacity = capacity;

        this.cache = new HashMap<>();

        this.list = new LinkedList();
    }

    public void itr(){
        Node itr=list.getHead();
        while(itr!=null){
            System.out.println(itr.val);
            itr=itr.next;
        }
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node=cache.get(key);
        list.moveToFront(node);
        return node.val;
    }

    public void put(int key,int value){
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            node.val=value;
            list.moveToFront(node);
            return;
        }

        if (cache.size() == capacity) {

            Node removed = list.removeLast();

            cache.remove(removed.key);
        }

        Node node = new Node(key, value);
        list.addFirst(node);
        cache.put(key, node);
    }
}