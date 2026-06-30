class Node {
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer, Node> mp;

    public void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertAfterHead(Node node) {
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mp = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)) {
            Node node = mp.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.val;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)) {
            Node node = this.mp.get(key);
            deleteNode(node);
            insertAfterHead(node);
            node.val = value;
            mp.put(key, node);
        }
        else {
            if(mp.size() == capacity) {
                Node node = tail.prev;
                mp.remove(node.key);
                deleteNode(tail.prev);
            }
            Node node = new Node(key, value);
            insertAfterHead(node);
            mp.put(key, node);
        }
    }
}
