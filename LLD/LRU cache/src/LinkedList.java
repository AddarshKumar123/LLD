public class LinkedList {
    private final Node head;
    private final Node tail;

    public LinkedList(){
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);

        head.next=tail;
        tail.prev=head;
    }

    public Node getHead(){
        return head;
    }

    public void addFirst(Node node){
        Node first=head.next;
        node.prev=head;
        node.next=first;

        first.prev=node;
        head.next=node;
    }

    public void remove(Node node){
        Node previous = node.prev;
        Node next = node.next;

        previous.next = next;
        next.prev = previous;
    }

    public Node removeLast(){
        if (head.next == tail) {
            return null;
        }

        Node lastNode = tail.prev;

        remove(lastNode);

        return lastNode;
    }

    public void moveToFront(Node node){
        remove(node);
        addFirst(node);
    }
}
