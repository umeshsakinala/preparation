class Node {
    int val;
    Node next;
    Node() {
        
    }
    Node(int val) {
        this.val = val;
    }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
class LinkedList {
    Node node;
    int size;
    public LinkedList() {
        this.node = null;
        this.size = 0;
    }

    public int get(int index) {
        int count = 0;
        Node temp = this.node;
        while(temp != null) {
            if(count == index) {
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        this.node = new Node(val, this.node);
        this.size++;
    }

    public void insertTail(int val) {
        if(this.node == null) {
            this.node = new Node(val);
        }
        else {
            Node temp = this.node;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
        }
        this.size++;
    }

    public boolean remove(int index) {
        if(index < 0 || index >= this.size) {
            return false;
        }
        Node dummy = new Node(0);
        dummy.next = this.node;
        Node beforeTemp = dummy;
        int count = 0;
        while(count != index) {
            beforeTemp = beforeTemp.next;
            count++;
        }
        beforeTemp.next = beforeTemp.next.next;
        this.size--;
        this.node = dummy.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> li = new ArrayList<Integer>();
        Node temp = this.node;
        while(temp != null) {
            li.add(temp.val);
            temp = temp.next;
        }
        return li;
    }
}
